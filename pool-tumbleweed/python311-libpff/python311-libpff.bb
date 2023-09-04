SUMMARY = "Library and tools to access Microsoft PFF/OFF/PST/OST/PAB files"
DESCRIPTION = "libpff is a library to access the Personal Folder File (PFF) and the \
Offline Folder File (OFF) format. These are used in several file \
Types: PAB (Personal Address Book), PST (Personal Storage Table) and \
OST (Offline Storage Table)."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230325"

RPM_NAME = "python311-libpff-20230325-2.1.aarch64.rpm"
RPM_HASH = "dc6cebac49df7cc1759b28d67f8a53f169900b7a5f58ce1588b9f55435540bb37614a2b069c90bb66fad64881e58eafb72f90e309bbcc56995b058b60277442a"

RPROVIDES:${PN} += "python3-libpff \
python311-libpff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libpff.so.1 \
python-abi"

inherit rpm
