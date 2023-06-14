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

RPM_NAME = "python39-precis-i18n-1.0.5-1.3.noarch.rpm"
RPM_HASH = "50eb23c1287d316aa53f89ce6f587d61377440daeb6bb2e8c10f91b4915e210a0fea9def375d2f9489bb0beac57327e118c1c6c24e01bd1596184611094c4cba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-precis-i18n \
python39-precis-i18n \
python3dist-precis-i18n"

RDEPENDS:${PN} += "python-abi"

inherit rpm
