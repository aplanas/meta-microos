SUMMARY = "Another Python SQLite Wrapper"
DESCRIPTION = "APSW is a Python wrapper for the SQLite embedded relational database \
engine. In contrast to other wrappers such as pysqlite it focuses on \
being a minimal layer over SQLite attempting just to translate the \
complete SQLite API into Python."
LICENSE = "Zlib"

PV = "3.42.0.0"

RPM_NAME = "python311-apsw-3.42.0.0-1.1.aarch64.rpm"
RPM_HASH = "2eb664168d3976e49cae53b04c83cd4b261fd490b74270247bda044e64f64be804beec70262a6ae362e56c8b849a18fc6531b30b3adf1f48018853d72f35c70a"

RPROVIDES:${PN} += "python3.11dist(apsw) \
python311-apsw \
python311-apsw(aarch-64) \
python3dist(apsw)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsqlite3.so.0()(64bit) \
python(abi)"

inherit rpm
