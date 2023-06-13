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

RPM_NAME = "python310-precis-i18n-1.0.5-1.3.noarch.rpm"
RPM_HASH = "af4fae3c999f7a0e3202ef5860f2c582bbf76bce70ab1b89d42de85b9f6bd4af6772fcf5882701df53649203e13927ff3234707e1f859ddf08e685ddbaac2bd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-precis-i18n \
python3.10dist(precis-i18n) \
python310-precis-i18n \
python3dist(precis-i18n)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
