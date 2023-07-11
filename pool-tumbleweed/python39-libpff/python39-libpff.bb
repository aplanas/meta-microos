SUMMARY = "Library and tools to access Microsoft PFF/OFF/PST/OST/PAB files"
DESCRIPTION = "libpff is a library to access the Personal Folder File (PFF) and the \
Offline Folder File (OFF) format. These are used in several file \
Types: PAB (Personal Address Book), PST (Personal Storage Table) and \
OST (Offline Storage Table)."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230325"

RPM_NAME = "python39-libpff-20230325-1.7.aarch64.rpm"
RPM_HASH = "f606fcb0ef0b8b6afd7a372a88023233cb7fca7a9622d52203f9846045a3b28c4a3cbda09c8ce9afd410bb18a4b0670666eaa82192602b1b70fc55c05a2158f2"

RPROVIDES:${PN} += "python39-libpff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libpff.so.1 \
python-abi"

inherit rpm
