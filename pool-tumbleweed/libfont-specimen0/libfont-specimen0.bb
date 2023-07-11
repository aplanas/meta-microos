SUMMARY = "Library for Creating Font Specimen"
DESCRIPTION = "Library that allows to create specimens for installed \
font."
LICENSE = "GPL-2.0+"

PV = "20150202"

RPM_NAME = "libfont-specimen0-20150202-3.18.aarch64.rpm"
RPM_HASH = "98e001b4a4f788d2ddc4426381aab31bcd9e0f9b73f747568603896ba4aa1fe1ef3bacf7463c7322b89ed304eb8147ea076ceae3a9b24cf6d871368d33bdf616"

RPROVIDES:${PN} += "libfont-specimen.so.0 \
libfont-specimen0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libharfbuzz.so.0 \
libpng16.so.16"

inherit rpm
