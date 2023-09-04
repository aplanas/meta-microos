SUMMARY = "Library and tools to access Microsoft PFF/OFF/PST/OST/PAB files"
DESCRIPTION = "libpff is a library to access the Personal Folder File (PFF) and the \
Offline Folder File (OFF) format. These are used in several file \
Types: PAB (Personal Address Book), PST (Personal Storage Table) and \
OST (Offline Storage Table)."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230325"

RPM_NAME = "python310-libpff-20230325-2.1.aarch64.rpm"
RPM_HASH = "aed9d0eaa40e8f676558f33d48bb1e82481ad4a2dca19b195ccb6bff43e0746d390023802d26665af9949386752d85e51262e72a794717965094a75cef2fd320"

RPROVIDES:${PN} += "python310-libpff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libpff.so.1 \
python-abi"

inherit rpm
