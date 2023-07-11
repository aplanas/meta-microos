SUMMARY = "Library that patches sslmatch_hostname for Unicode/IDNA domain support"
DESCRIPTION = "This patches ssl.match_hostname for Unicode/IDNA domain support. \
The ssl.match_hostname issue is fixed (as of January 27 2018) in upcoming \
Python 3.7, but IDNA2008 (RFC 5895) is still broken."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-idna_ssl-1.1.0-4.1.noarch.rpm"
RPM_HASH = "d6e86a216dcea53666c8642a4f1dd8deee440346f029c58c48cef89a57f3b8ee71fcdd576d869f68a58264f88ed000727109a1603d5f0fd4c37e5a4de7527095"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-idna-ssl \
python39-idna-ssl \
python3dist-idna-ssl"

RDEPENDS:${PN} += "python-abi \
python39-idna"

inherit rpm
