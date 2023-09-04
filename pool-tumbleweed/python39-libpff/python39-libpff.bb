SUMMARY = "Library and tools to access Microsoft PFF/OFF/PST/OST/PAB files"
DESCRIPTION = "libpff is a library to access the Personal Folder File (PFF) and the \
Offline Folder File (OFF) format. These are used in several file \
Types: PAB (Personal Address Book), PST (Personal Storage Table) and \
OST (Offline Storage Table)."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230325"

RPM_NAME = "python39-libpff-20230325-2.1.aarch64.rpm"
RPM_HASH = "0e4bea6f19074e8c74188e86772b3125736296fcc3f315e1f04d6f2b11ab317de85e2bd896f9f219fac51e5f601a793f17bbd14329c25498bb47d69246cee7d1"

RPROVIDES:${PN} += "python39-libpff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libpff.so.1 \
python-abi"

inherit rpm
