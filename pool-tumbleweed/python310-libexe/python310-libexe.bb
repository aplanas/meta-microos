SUMMARY = "Library to access the executable (EXE) format"
DESCRIPTION = "libexe is a library and related tools to parse .exe files \
(specifically PE/COFF) and the resources stored in them using \
libwrc. This functionality is used in libevt and libevx to parse \
EventLog messages from PE/COFF message files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "python310-libexe-20210424-4.6.aarch64.rpm"
RPM_HASH = "83c5818e6c66ba01d2d323ea79c62aa510c753e7332dc75e5b2d40a690e7d1d5a3629b39f78ff3df8ae5410cbd2e375f69b83c5c6fb28ce6582db84001cbb881"

RPROVIDES:${PN} += "python3-libexe \
python310-libexe \
python310-libexe(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6()(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libexe.so.1()(64bit) \
libexe.so.1(V_20210424)(64bit) \
python(abi)"

inherit rpm
