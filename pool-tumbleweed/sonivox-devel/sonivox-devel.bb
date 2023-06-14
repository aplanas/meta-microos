SUMMARY = "Sonivox library - Development files"
DESCRIPTION = "Development files for the sonivox library."
LICENSE = "Apache-2.0"

PV = "3.6.11"

RPM_NAME = "sonivox-devel-3.6.11-1.3.aarch64.rpm"
RPM_HASH = "c3e81148760c58406d6c0df0304aa2de14c1092e36b4f6e2e05f46307528529116e1080f56c7832d34c2f12ff4bc5cdf63c089ff15fa765b89f51f4976268259"

RPROVIDES:${PN} += "cmake-sonivox \
pkgconfig-sonivox \
sonivox-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsonivox3"

inherit rpm
