SUMMARY = "Another Python SQLite Wrapper"
DESCRIPTION = "APSW is a Python wrapper for the SQLite embedded relational database \
engine. In contrast to other wrappers such as pysqlite it focuses on \
being a minimal layer over SQLite attempting just to translate the \
complete SQLite API into Python."
LICENSE = "Zlib"

PV = "3.42.0.1"

RPM_NAME = "python310-apsw-3.42.0.1-1.1.aarch64.rpm"
RPM_HASH = "32f7497882d5eff64631077873454231574d5d759988bbd01b072052467eac85601211d91bb95b0b62b6785774bf50c5944a93da736462428f89e417b373d8c5"

RPROVIDES:${PN} += "python3.10dist-apsw \
python310-apsw \
python3dist-apsw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
python-abi"

inherit rpm
