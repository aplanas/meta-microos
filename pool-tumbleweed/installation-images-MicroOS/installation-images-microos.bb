SUMMARY = "Installation Image Files for MicroOS"
DESCRIPTION = "Files needed for MicroOS installation media."
LICENSE = "GPL-2.0-or-later"

PV = "17.90"

RPM_NAME = "installation-images-MicroOS-17.90-1.26.aarch64.rpm"
RPM_HASH = "383b397ee47c97711666350dcfac0bab458905d8f90cb49e80c441a9f44717031ce67a4f381388de00e751c8d4fcd4cab3b2a4e7dfa8912455b7485d34ebc132"

RPROVIDES:${PN} += "installation-images \
installation-images-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
