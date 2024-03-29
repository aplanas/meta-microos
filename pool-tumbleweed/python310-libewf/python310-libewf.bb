SUMMARY = "Library for the Expert Witness Compression Format (EWF)"
DESCRIPTION = "libewf is a library for support of the Expert Witness Compression \
Format (EWF). It supports both the SMART format (EWF-S01) and the \
EnCase format (EWF-E01). libewf allows you to read and write media \
information within the EWF files. libewf allows to read files created \
by EnCase 1 to 6, linen and FTK Imager."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230212"

RPM_NAME = "python310-libewf-20230212-3.1.aarch64.rpm"
RPM_HASH = "bf68e54cb1694fe1165ad4fd4fd480a1be7b4aa5ade77580ebf1236678f80ac28395639beb76df3de8b725740ae65161421d57411f1f56bcb7b2f71bff71ce5a"

RPROVIDES:${PN} += "python310-libewf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libewf.so.3 \
python-abi"

inherit rpm
