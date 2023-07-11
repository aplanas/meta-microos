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

RPM_NAME = "python310-precis-i18n-1.0.5-1.4.noarch.rpm"
RPM_HASH = "31207aa6943ba9ab2a70a4fc251327b44bfc7b024c8d6be739dd13dc0ad39db65d8ef817fe79776231400f19ab27f7a0f3588d38c95ce7a1879c706efff2cabe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-precis-i18n \
python310-precis-i18n \
python3dist-precis-i18n"

RDEPENDS:${PN} += "python-abi"

inherit rpm
