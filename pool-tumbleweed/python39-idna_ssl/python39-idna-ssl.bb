SUMMARY = "Library that patches sslmatch_hostname for Unicode/IDNA domain support"
DESCRIPTION = "This patches ssl.match_hostname for Unicode/IDNA domain support. \
The ssl.match_hostname issue is fixed (as of January 27 2018) in upcoming \
Python 3.7, but IDNA2008 (RFC 5895) is still broken."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-idna_ssl-1.1.0-3.12.noarch.rpm"
RPM_HASH = "6b0693b954f473d31911590cf2331c8a66eb53967fbd9fe7917dcd7c56bde30f7ce82e2314018b80e37836aaba77669428b65d76558595b359aeddf093361126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(idna-ssl) \
python39-idna_ssl \
python3dist(idna-ssl)"
RDEPENDS:${PN} += "python(abi) \
python39-idna"

inherit rpm
