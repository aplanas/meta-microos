SUMMARY = "Library for the Expert Witness Compression Format (EWF)"
DESCRIPTION = "libewf is a library for support of the Expert Witness Compression \
Format (EWF). It supports both the SMART format (EWF-S01) and the \
EnCase format (EWF-E01). libewf allows you to read and write media \
information within the EWF files. libewf allows to read files created \
by EnCase 1 to 6, linen and FTK Imager."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230212"

RPM_NAME = "python311-libewf-20230212-2.8.aarch64.rpm"
RPM_HASH = "27cb446ed0b2cdebf55983db5fef30f07729c88381436327931213e112fa48f3fd7d5f5ecc6eaefbee7d5281bb05eb814dd0c2c612783987875d1200853a6041"

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
