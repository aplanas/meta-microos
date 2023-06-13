SUMMARY = "Development files for boxfort"
DESCRIPTION = "Development files for boxfort."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "boxfort-devel-0.1.4-1.3.aarch64.rpm"
RPM_HASH = "9c928b3db83c0ee300003411701c3d74f520778d8ec0d3fd8f6a2f86fef4f3b1b75f11050f7b088153ee83cd559d1bf06af3f091922a0f04df502b558ac4abb7"

RPROVIDES:${PN} += "boxfort-devel \
boxfort-devel(aarch-64) \
pkgconfig(boxfort)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
boxfort"

inherit rpm
