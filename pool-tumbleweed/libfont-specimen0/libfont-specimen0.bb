SUMMARY = "Library for Creating Font Specimen"
DESCRIPTION = "Library that allows to create specimens for installed \
font."
LICENSE = "GPL-2.0+"

PV = "20150202"

RPM_NAME = "libfont-specimen0-20150202-3.17.aarch64.rpm"
RPM_HASH = "5234d1e0de6d416b034fb0692cc60eea6be516263c7c438faa4c13710f530c68c26ec60c78e3e92fca333a1973683edf21e8735aafbc892a795e08cedf613bce"

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
