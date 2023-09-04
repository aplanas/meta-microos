SUMMARY = "Library for the Expert Witness Compression Format (EWF)"
DESCRIPTION = "libewf is a library for support of the Expert Witness Compression \
Format (EWF). It supports both the SMART format (EWF-S01) and the \
EnCase format (EWF-E01). libewf allows you to read and write media \
information within the EWF files. libewf allows to read files created \
by EnCase 1 to 6, linen and FTK Imager."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230212"

RPM_NAME = "python311-libewf-20230212-3.1.aarch64.rpm"
RPM_HASH = "981343d11267b6eea67cc2cdff9bf8232ff3176d1a5325f32b122ae6985d9e2e4c02198bb4b8cde7add3b9e641f96aafab543a72b45eea089a4571475cb3a02e"

RPROVIDES:${PN} += "python3-libewf \
python311-libewf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libewf.so.3 \
python-abi"

inherit rpm
