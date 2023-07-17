SUMMARY = "Library for the Expert Witness Compression Format (EWF)"
DESCRIPTION = "libewf is a library for support of the Expert Witness Compression \
Format (EWF). It supports both the SMART format (EWF-S01) and the \
EnCase format (EWF-E01). libewf allows you to read and write media \
information within the EWF files. libewf allows to read files created \
by EnCase 1 to 6, linen and FTK Imager."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230212"

RPM_NAME = "python39-libewf-20230212-2.8.aarch64.rpm"
RPM_HASH = "c40d0dbf5eb5d67779ff8328e8b030070c403d3deb0c02aae9c4a0ebde79bb56b5a25444b519518023e36cac42d29017089b6faaa33ac4d35443dc04e8736c25"

RPROVIDES:${PN} += "python39-libewf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libewf.so.3 \
python-abi"

inherit rpm
