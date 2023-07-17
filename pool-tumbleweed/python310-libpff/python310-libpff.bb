SUMMARY = "Library and tools to access Microsoft PFF/OFF/PST/OST/PAB files"
DESCRIPTION = "libpff is a library to access the Personal Folder File (PFF) and the \
Offline Folder File (OFF) format. These are used in several file \
Types: PAB (Personal Address Book), PST (Personal Storage Table) and \
OST (Offline Storage Table)."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230325"

RPM_NAME = "python310-libpff-20230325-1.8.aarch64.rpm"
RPM_HASH = "c32d3c37ea096661d5fd340c35d2b49e71e361ba4b62bf42f84d6ef5f17bc64266ba70248b86b0c667d973c467d588eb46d91b7306b9f63caa068518e3632182"

RPROVIDES:${PN} += "python310-libpff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libpff.so.1 \
python-abi"

inherit rpm
