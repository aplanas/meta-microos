SUMMARY = "Library that patches sslmatch_hostname for Unicode/IDNA domain support"
DESCRIPTION = "This patches ssl.match_hostname for Unicode/IDNA domain support. \
The ssl.match_hostname issue is fixed (as of January 27 2018) in upcoming \
Python 3.7, but IDNA2008 (RFC 5895) is still broken."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-idna_ssl-1.1.0-3.12.noarch.rpm"
RPM_HASH = "0e3358ea782e661f05aabb1ee7832742a9aaab2158d7537f91bfb17fcf7b7d24eff485c780248a81e1fd3a202aa34e0e62b7440b32c6c1baa2164aa7c864d7ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(idna-ssl) \
python311-idna_ssl \
python3dist(idna-ssl)"

RDEPENDS:${PN} += "python(abi) \
python311-idna"

inherit rpm
