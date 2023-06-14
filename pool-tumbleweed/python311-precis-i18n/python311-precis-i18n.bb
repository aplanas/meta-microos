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

RPM_NAME = "python311-precis-i18n-1.0.5-1.3.noarch.rpm"
RPM_HASH = "ce4182e29195428518f1b6ac581aab075097169b516f5cd010aca1d7e281b85fa39356ffa1823af886d56fb8a15c50662e00d9893b2e3b7b61ab95204d8db233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-precis-i18n \
python311-precis-i18n \
python3dist-precis-i18n"

RDEPENDS:${PN} += "python-abi"

inherit rpm
