SUMMARY = "Assorted data for irrlicht"
DESCRIPTION = "Data files for irrlicht applications \
 \
The Irrlicht Engine is a realtime 3D engine written and usable in C++ \
and also available for .NET languages. It is using Direct3D, OpenGL \
and its own software renderer, and has features which can be found in \
commercial 3D engines."
LICENSE = "Zlib"

PV = "1.8.5"

RPM_NAME = "irrlicht-data-1.8.5-1.10.aarch64.rpm"
RPM_HASH = "8be4a07bf80d174fa4cea6bf95346ec531db5637ad6e1519ad82e326933d8bf748f0bbd6682502329c1eb04506c0cd91e2974877f688690b23fb286c26ed76cf"

RPROVIDES:${PN} += "irrlicht-data"

RDEPENDS:${PN} += ""

inherit rpm
