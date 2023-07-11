SUMMARY = "Library and tools to access Microsoft PFF/OFF/PST/OST/PAB files"
DESCRIPTION = "libpff is a library to access the Personal Folder File (PFF) and the \
Offline Folder File (OFF) format. These are used in several file \
Types: PAB (Personal Address Book), PST (Personal Storage Table) and \
OST (Offline Storage Table)."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230325"

RPM_NAME = "python311-libpff-20230325-1.7.aarch64.rpm"
RPM_HASH = "bae4702dd29735036f83a9df03aebe706809beda43bf449e225fefbc237b516eb8fec51cf5ca6cb8db763cc027ef9aa8700754fe46e921078e1f6ed8e88b2583"

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
