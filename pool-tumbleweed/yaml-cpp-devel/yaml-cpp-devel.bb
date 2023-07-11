SUMMARY = "Development files for yaml-cpp"
DESCRIPTION = "Development files for yaml-cpp library."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "yaml-cpp-devel-0.7.0-2.2.aarch64.rpm"
RPM_HASH = "55b62106536c6ed199960fd5096fd97e0bd027ccdc89ec83bf5e47168227f372ce02fb4741ac757993888c8e59ea61a408003f61c6df808fad1aa38512f3472b"

RPROVIDES:${PN} += "cmake-yaml-cpp \
pkgconfig-yaml-cpp \
yaml-cpp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyaml-cpp0-7"

inherit rpm
