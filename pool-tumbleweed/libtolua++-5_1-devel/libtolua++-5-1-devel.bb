SUMMARY = "Development headers for tolua++"
DESCRIPTION = "This package provides development headers for tolua++."
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "libtolua++-5_1-devel-1.0.93-10.3.aarch64.rpm"
RPM_HASH = "b43ce9308de758d215cd7b415a8a63f615562b34d4a2b5294df8d31b5237170671c5ec82105fcdd4e389583e549dbf2af5232119ffcd7822741cbb504f15a99e"

RPROVIDES:${PN} += "libtolua++-5_1-devel \
libtolua++-5_1-devel(aarch-64) \
pkgconfig(tolua++) \
toluapp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
toluapp-5.1"

inherit rpm
