SUMMARY = "Sonivox library - Development files"
DESCRIPTION = "Development files for the sonivox library."
LICENSE = "Apache-2.0"

PV = "3.6.11"

RPM_NAME = "sonivox-devel-3.6.11-1.4.aarch64.rpm"
RPM_HASH = "875e4e22707c41aef5831cc7d0acf0e42e1ea5900d5310a574bd96e8a7a85c4c6c0f63461e79bbc0b4c0507e97f967b9c9e0a7a19f11060e1d8056eb84936347"

RPROVIDES:${PN} += "cmake-sonivox \
pkgconfig-sonivox \
sonivox-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsonivox3"

inherit rpm
