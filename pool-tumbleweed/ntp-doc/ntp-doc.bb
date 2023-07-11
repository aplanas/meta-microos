SUMMARY = "Additional Package Documentation for ntp"
DESCRIPTION = "The complete set of documentation for building and configuring an NTP \
server or client. The documentation is in the form of HTML files \
suitable for browsing and contains links to additional documentation at \
various web sites. \
 \
What about NTP? Understanding and using the Network Time Protocol (A \
first try on a non-technical Mini-HOWTO and FAQ on NTP). Edited by \
Ulrich Windl and David Dalton."
LICENSE = "BSD-3-Clause & MIT & BSD-4-Clause & GPL-2.0-only"

PV = "4.2.8p17"

RPM_NAME = "ntp-doc-4.2.8p17-1.1.aarch64.rpm"
RPM_HASH = "583e54d5231260d5600cc47f089d249d2c0e5c9719e19fa7aa4277615f7dc58dda615ca4ee44cb8c16e1bfde8ccb881a0fe3c2c8562d085f994a6c70e267d326"

RPROVIDES:${PN} += "ntp-doc \
ntpdoc \
xntp-doc \
xntpdoc"

RDEPENDS:${PN} += ""

inherit rpm
