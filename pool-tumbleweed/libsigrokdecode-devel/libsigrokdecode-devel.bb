SUMMARY = "Protocol Decoder Library for sigrok"
DESCRIPTION = "The sigrok project aims at creating a portable, cross-platform, \
Free/Libre/Open-Source logic analyzer software that supports various \
logic analyzer hardware products. \
 \
libsigrokdecode is a shared library written in C which provides the basic \
API for running sigrok protocol decoders. The protocol decoders themselves \
are written in Python."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.3"

RPM_NAME = "libsigrokdecode-devel-0.5.3-2.5.aarch64.rpm"
RPM_HASH = "fb0f8ea49f9eb40364d83c2dfc9aaf5b11bc4102671190c154567d26bfdaa07c708c7970a0dafb98d0aab67a52ad7b7e19534d2d007f8525bb2b36edc85d79de"

RPROVIDES:${PN} += "libsigrokdecode-devel \
pkgconfig-libsigrokdecode"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsigrokdecode4 \
pkgconfig-glib-2.0 \
pkgconfig-python3-embed \
python3-devel"

inherit rpm
