SUMMARY = "Library to access the executable (EXE) format"
DESCRIPTION = "libexe is a library and related tools to parse .exe files \
(specifically PE/COFF) and the resources stored in them using \
libwrc. This functionality is used in libevt and libevx to parse \
EventLog messages from PE/COFF message files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "python311-libexe-20210424-4.6.aarch64.rpm"
RPM_HASH = "d1f30ff31fd52f5105be96716db733d91e8e21369c18f2b8eba59ecd58f320da31aff2ee4cbd9d831642d7cbe96e476012976e9dee953b4e6a9c921f6c28abe4"

RPROVIDES:${PN} += "python311-libexe \
python311-libexe(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libexe.so.1()(64bit) \
libexe.so.1(V_20210424)(64bit) \
python(abi)"

inherit rpm
