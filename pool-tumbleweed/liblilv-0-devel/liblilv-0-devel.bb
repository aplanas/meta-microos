SUMMARY = "Development files for liblilv"
DESCRIPTION = "Lilv is a C library to make use of LV2 plugins in applications. \
This subpackage contains the development files for liblilv."
LICENSE = "ISC"

PV = "0.24.20"

RPM_NAME = "liblilv-0-devel-0.24.20-1.2.aarch64.rpm"
RPM_HASH = "1c164c09841333e6c0e46079a299d013f72ab27aca2295c96e1bb683e16cc0623c04075e23a572833ecc19765353cfc0a61c6fe97e497a43ea91c19410958dcd"

RPROVIDES:${PN} += "liblilv-0-devel \
pkgconfig-lilv-0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblilv-0-0 \
pkgconfig-lv2 \
pkgconfig-serd-0 \
pkgconfig-sord-0 \
pkgconfig-sratom-0"

inherit rpm
