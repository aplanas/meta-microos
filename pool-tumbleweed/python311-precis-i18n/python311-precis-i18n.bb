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

RPM_NAME = "python311-precis-i18n-1.0.5-1.4.noarch.rpm"
RPM_HASH = "a873b90da86ef8133f82007db8000a1ba018799a2d1d2f4d380160c185dd7db6758bfe53b169124065775a03d145bf664a618a2b1b7d17b891467996d0b1eb66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-precis-i18n \
python3.11dist-precis-i18n \
python311-precis-i18n \
python3dist-precis-i18n"

RDEPENDS:${PN} += "python-abi"

inherit rpm
