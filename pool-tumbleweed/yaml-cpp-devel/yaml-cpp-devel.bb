SUMMARY = "Development files for yaml-cpp"
DESCRIPTION = "Development files for yaml-cpp library."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "yaml-cpp-devel-0.8.0-1.1.aarch64.rpm"
RPM_HASH = "ed7ba7590bf6bdefcc2895fbb8b2c0a56c76c2cd2f0a6c55504c7cb35976f7228eefb05d7b7ec4840fe68d27c91bf974819c5285a6eaa16a9dc493119dde09d3"

RPROVIDES:${PN} += "cmake-yaml-cpp \
pkgconfig-yaml-cpp \
yaml-cpp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyaml-cpp0-8"

inherit rpm
