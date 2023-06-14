SUMMARY = "Development package for deepin-wayland"
DESCRIPTION = "Header files and libraries for deepin-wayland."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "deepin-wayland-devel-1.0.0-1.11.aarch64.rpm"
RPM_HASH = "6bef3378ef0277f747920599122e62aa8c57cf1d4f99fcf295b4f96ca80bde45ae7c022e6461d255c281c68fb1580fb4c89da425f4ae884050b4f67586ad6721"

RPROVIDES:${PN} += "deepin-wayland-devel \
pkgconfig-dde-wayland-client \
pkgconfig-dde-wayland-server"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdde-wayland-client0 \
libdde-wayland-server0"

inherit rpm
