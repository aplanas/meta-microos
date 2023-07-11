SUMMARY = "Library that patches sslmatch_hostname for Unicode/IDNA domain support"
DESCRIPTION = "This patches ssl.match_hostname for Unicode/IDNA domain support. \
The ssl.match_hostname issue is fixed (as of January 27 2018) in upcoming \
Python 3.7, but IDNA2008 (RFC 5895) is still broken."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-idna_ssl-1.1.0-4.1.noarch.rpm"
RPM_HASH = "4bd8efd11b798711f404831ae5feeeba8a705679b44a8a7e66a2cb0446b849d39eb0ccb6b30f58bcde95fac5e3b7513771b1ba8ad1247f696ccc5842cc6fc0a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-idna-ssl \
python310-idna-ssl \
python3dist-idna-ssl"

RDEPENDS:${PN} += "python-abi \
python310-idna"

inherit rpm
