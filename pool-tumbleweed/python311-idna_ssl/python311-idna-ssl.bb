SUMMARY = "Library that patches sslmatch_hostname for Unicode/IDNA domain support"
DESCRIPTION = "This patches ssl.match_hostname for Unicode/IDNA domain support. \
The ssl.match_hostname issue is fixed (as of January 27 2018) in upcoming \
Python 3.7, but IDNA2008 (RFC 5895) is still broken."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-idna_ssl-1.1.0-4.1.noarch.rpm"
RPM_HASH = "7a97657044a907ce39b92c01d4b91496d1a0cd18f9a382ae39b32df79338bfa3afd9f1fd71e4095fe3c0762d7364ed3415a45db9a0f02b6995b0213bfee69d25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-idna-ssl \
python3.11dist-idna-ssl \
python311-idna-ssl \
python3dist-idna-ssl"

RDEPENDS:${PN} += "python-abi \
python311-idna"

inherit rpm
