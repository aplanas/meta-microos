SUMMARY = "Utility to create index of scalable font files for X"
DESCRIPTION = "mkfontscale creates the fonts.scale and fonts.dir index files used by the \
legacy X11 font system."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "mkfontscale-1.2.2-1.7.aarch64.rpm"
RPM_HASH = "6bd0f274cdde7c54bbc9facb62b08e6c14cf64bc70c16b339798ef64daeb6d80ce0dcf68622cb3f968cd1efb8e0e2bf1900877da44a22ddda379a20d580e544a"

RPROVIDES:${PN} += "mkfontdir \
mkfontscale"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontenc.so.1 \
libfreetype.so.6 \
libz.so.1"

inherit rpm
