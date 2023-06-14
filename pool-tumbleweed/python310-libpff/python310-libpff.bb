SUMMARY = "Library and tools to access Microsoft PFF/OFF/PST/OST/PAB files"
DESCRIPTION = "libpff is a library to access the Personal Folder File (PFF) and the \
Offline Folder File (OFF) format. These are used in several file \
Types: PAB (Personal Address Book), PST (Personal Storage Table) and \
OST (Offline Storage Table)."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230325"

RPM_NAME = "python310-libpff-20230325-1.4.aarch64.rpm"
RPM_HASH = "7289d7c87243495ed339692f2cbf955f95a3d59d71a0c7576c360f8a2e45f09614df6697a6119dd28545ee8bdfb3bc20e103120913d5ce4384963e3804d78262"

RPROVIDES:${PN} += "python3-libpff \
python310-libpff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libpff.so.1 \
python-abi"

inherit rpm
