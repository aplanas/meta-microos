SUMMARY = "Internationalised Usernames and Passwords"
DESCRIPTION = "The PRECIS framework makes internationalised user names and \
passwords safer for use by applications. PRECIS profiles transform \
unicode strings into a canonical form, suitable for comparison. \
 \
This module implements the PRECIS Framework as described in: \
 - PRECIS Framework: Preparation, Enforcement, and Comparison of \
   Internationalized Strings in Application Protocols (RFC 8264). \
 - Preparation, Enforcement, and Comparison of Internationalized \
   Strings Representing Usernames and Passwords (RFC 8265). \
 - Preparation, Enforcement, and Comparison of Internationalized \
   Strings Representing Nicknames (RFC 8266)."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "python39-precis-i18n-1.0.5-1.4.noarch.rpm"
RPM_HASH = "ac795edb49b7545fe34b8c6722a5449a0139448d0b10cf0e89bea908245f3fde1096e945ab3633e01d26c21f566f851eff93c8f16398f3be2d553540740331b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-precis-i18n \
python39-precis-i18n \
python3dist-precis-i18n"

RDEPENDS:${PN} += "python-abi"

inherit rpm
