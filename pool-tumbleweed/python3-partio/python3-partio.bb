SUMMARY = "Core partio libraries"
DESCRIPTION = "The python3-partio contains Python 3 binding for the library."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "python3-partio-1.14.6-1.9.aarch64.rpm"
RPM_HASH = "a4a0f167b55e79133613bec0cbcef7041b577c2bab25c9f39f60cc20be151d64492d0c3a9fac1b61df1129fded2dae6aaf0ca25bab0353247feb1659501d4f25"

RPROVIDES:${PN} += "python3-partio \
python3-partio(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libpartio.so.1()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
partio \
python(abi)"

inherit rpm
