SUMMARY = "Serial support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature serial"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-serial-22.10.0-7.1.noarch.rpm"
RPM_HASH = "2024df49d621b1730a880970c870bfe12ff3074cadfde58ae7424367effd9f4011b7fc374bd75dbff02f52044dfb3e758936cc4234553a6bac1da2960dd0b763"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-serial"

RDEPENDS:${PN} += "python39-Twisted \
python39-pyserial"

inherit rpm
