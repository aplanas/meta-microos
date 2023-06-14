SUMMARY = "Library for the Expert Witness Compression Format (EWF)"
DESCRIPTION = "libewf is a library for support of the Expert Witness Compression \
Format (EWF). It supports both the SMART format (EWF-S01) and the \
EnCase format (EWF-E01). libewf allows you to read and write media \
information within the EWF files. libewf allows to read files created \
by EnCase 1 to 6, linen and FTK Imager."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230212"

RPM_NAME = "python310-libewf-20230212-2.3.aarch64.rpm"
RPM_HASH = "b5fc118c583c10278f182a9ebd0d574cf2c249e2536587e4418afd9ca7e15de408f48e2207b89c2067080f316da37b028bd78d8314252f0f0762a67e8d03dbeb"

RPROVIDES:${PN} += "python3-libewf \
python310-libewf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libewf.so.3 \
python-abi"

inherit rpm
