SUMMARY = "Library for the Expert Witness Compression Format (EWF)"
DESCRIPTION = "libewf is a library for support of the Expert Witness Compression \
Format (EWF). It supports both the SMART format (EWF-S01) and the \
EnCase format (EWF-E01). libewf allows you to read and write media \
information within the EWF files. libewf allows to read files created \
by EnCase 1 to 6, linen and FTK Imager."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230212"

RPM_NAME = "python39-libewf-20230212-3.1.aarch64.rpm"
RPM_HASH = "43b08cb1f92f5c47eaf968536b2dcb625784a1d80098c616c282f593c984af88c6ab5a9900ca4f3210d4e5135818ad52c05cf8fa7f61e78b5d9291d4a7bfd0d0"

RPROVIDES:${PN} += "python39-libewf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libewf.so.3 \
python-abi"

inherit rpm
