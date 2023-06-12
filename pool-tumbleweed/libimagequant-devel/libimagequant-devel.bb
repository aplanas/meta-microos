SUMMARY = "Development files for libimagequant"
DESCRIPTION = "C library for conversion of RGBA images to 8-bit indexed-color \
(palette) images."
LICENSE = "GPL-3.0-or-later"

PV = "2.18.0"

RPM_NAME = "libimagequant-devel-2.18.0-1.3.aarch64.rpm"
RPM_HASH = "2987253f5bebd46201365dee35cdadc69870436baabdfef74187e51bebe49c5ffb1a146cc3580b98e84746f3bc1a927cf4d042fd6dc66292766bee487053ee97"

RPROVIDES:${PN} += "libimagequant-devel \
libimagequant-devel(aarch-64) \
pkgconfig(imagequant)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libimagequant0"

inherit rpm
