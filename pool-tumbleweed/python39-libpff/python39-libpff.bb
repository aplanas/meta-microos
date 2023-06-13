SUMMARY = "Library and tools to access Microsoft PFF/OFF/PST/OST/PAB files"
DESCRIPTION = "libpff is a library to access the Personal Folder File (PFF) and the \
Offline Folder File (OFF) format. These are used in several file \
Types: PAB (Personal Address Book), PST (Personal Storage Table) and \
OST (Offline Storage Table)."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230325"

RPM_NAME = "python39-libpff-20230325-1.4.aarch64.rpm"
RPM_HASH = "7a6e53261c3307881521d6490e96621f3acab4d7f99fca4f0d65c21fe6c8a1cf186e757324ca2877651e0c436ead6ade3bb69d30a2ef9d900a1783a4170ca95f"

RPROVIDES:${PN} += "python39-libpff \
python39-libpff(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6()(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libpff.so.1()(64bit) \
libpff.so.1(V_20230325)(64bit) \
python(abi)"

inherit rpm
