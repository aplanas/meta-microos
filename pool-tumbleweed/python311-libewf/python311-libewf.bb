SUMMARY = "Library for the Expert Witness Compression Format (EWF)"
DESCRIPTION = "libewf is a library for support of the Expert Witness Compression \
Format (EWF). It supports both the SMART format (EWF-S01) and the \
EnCase format (EWF-E01). libewf allows you to read and write media \
information within the EWF files. libewf allows to read files created \
by EnCase 1 to 6, linen and FTK Imager."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230212"

RPM_NAME = "python311-libewf-20230212-2.7.aarch64.rpm"
RPM_HASH = "c8e6b53d5a9bd3895d119f1043aa95bd343096df8e9cca63de4d0bdd67dcfc9b3904a6238445b4c333e10e15a85eb1f1f5cb73490720d4ca5606fe28d28b8084"

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
