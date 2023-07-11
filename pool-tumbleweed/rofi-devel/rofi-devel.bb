SUMMARY = "Development files for rofi"
DESCRIPTION = "Development files and headers for rofi"
LICENSE = "MIT"

PV = "1.7.5"

RPM_NAME = "rofi-devel-1.7.5-2.4.aarch64.rpm"
RPM_HASH = "2ff7420d0ccc07727c696e8b8cc26d76106e5374b3fd7dd4a82da54ddb9cd8437aa5ba225580fd9996b4bb4ef5850fe05ba898d2e3e86bda07f7ff96e86bce46"

RPROVIDES:${PN} += "pkgconfig-rofi \
rofi-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-cairo \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0"

inherit rpm
