SUMMARY = "Library and tools to access Microsoft PFF/OFF/PST/OST/PAB files"
DESCRIPTION = "libpff is a library to access the Personal Folder File (PFF) and the \
Offline Folder File (OFF) format. These are used in several file \
Types: PAB (Personal Address Book), PST (Personal Storage Table) and \
OST (Offline Storage Table)."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230325"

RPM_NAME = "python39-libpff-20230325-1.8.aarch64.rpm"
RPM_HASH = "dab5b3b6dc7fc82ba586bc95a7bc1df41d01b6ea5a4d190354ab5b8a8fb0c80235f41d4df3b0d53c0e008b6e4e2be2ccbd87efb915fd0c807ac7ffdfcdaab3f4"

RPROVIDES:${PN} += "python39-libpff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libpff.so.1 \
python-abi"

inherit rpm
