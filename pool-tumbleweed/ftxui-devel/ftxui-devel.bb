SUMMARY = "Devel files for ftxui"
DESCRIPTION = "Development files for ftxui."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "ftxui-devel-5.0.0-1.1.aarch64.rpm"
RPM_HASH = "871854d1491395f1b8c6f3da4201e4b4819b5cf67d15ed7fceb4fbeefc32c9fea1fa9f81eaf772ede561c90205beae51b6bf8387165cac29887d2a4df63b4142"

RPROVIDES:${PN} += "cmake-ftxui \
ftxui \
ftxui-devel \
pkgconfig-ftxui"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libftxui5-0-0"

inherit rpm
