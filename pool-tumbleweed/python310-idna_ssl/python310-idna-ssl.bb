SUMMARY = "Library that patches sslmatch_hostname for Unicode/IDNA domain support"
DESCRIPTION = "This patches ssl.match_hostname for Unicode/IDNA domain support. \
The ssl.match_hostname issue is fixed (as of January 27 2018) in upcoming \
Python 3.7, but IDNA2008 (RFC 5895) is still broken."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-idna_ssl-1.1.0-3.12.noarch.rpm"
RPM_HASH = "4dce2dcda3f598c986661918dbfc20c29369fecb522f41a1357b6d63b027b28805eeca04bb04d5087dd4fb2ad3c61903586453ae545510a5338534c30382e16a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-idna_ssl \
python3.10dist(idna-ssl) \
python310-idna_ssl \
python3dist(idna-ssl)"
RDEPENDS:${PN} += "python(abi) \
python310-idna"

inherit rpm
