SUMMARY = "Another Python SQLite Wrapper"
DESCRIPTION = "APSW is a Python wrapper for the SQLite embedded relational database \
engine. In contrast to other wrappers such as pysqlite it focuses on \
being a minimal layer over SQLite attempting just to translate the \
complete SQLite API into Python."
LICENSE = "Zlib"

PV = "3.42.0.0"

RPM_NAME = "python311-apsw-3.42.0.0-2.1.aarch64.rpm"
RPM_HASH = "2b49195276d74fe2aadc086e873dc720ab136549d9878a291a88eefe06d9b3365634f756d8cb8242aa4343eadad58ce5bef452ebfefcf3ded17c2c12bd2f407e"

RPROVIDES:${PN} += "python3-apsw \
python3.11dist-apsw \
python311-apsw \
python3dist-apsw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
python-abi"

inherit rpm
