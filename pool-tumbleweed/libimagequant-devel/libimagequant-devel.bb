SUMMARY = "Development files for libimagequant"
DESCRIPTION = "C library for conversion of RGBA images to 8-bit indexed-color \
(palette) images."
LICENSE = "GPL-3.0-or-later"

PV = "2.18.0"

RPM_NAME = "libimagequant-devel-2.18.0-1.4.aarch64.rpm"
RPM_HASH = "f7ad79dabf1c7652aebea3a5ee94f9169785bc3c0c3a41ef8475ec70cdd534ee41f92492370321f0acf02967a61858ea4e0b6f7de3eef9a961dbca9a2b1809ce"

RPROVIDES:${PN} += "libimagequant-devel \
pkgconfig-imagequant"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libimagequant0"

inherit rpm
