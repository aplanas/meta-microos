SUMMARY = "Another Python SQLite Wrapper"
DESCRIPTION = "APSW is a Python wrapper for the SQLite embedded relational database \
engine. In contrast to other wrappers such as pysqlite it focuses on \
being a minimal layer over SQLite attempting just to translate the \
complete SQLite API into Python."
LICENSE = "Zlib"

PV = "3.42.0.0"

RPM_NAME = "python39-apsw-3.42.0.0-1.1.aarch64.rpm"
RPM_HASH = "10812c2ed6ecf9f835b8a669783f3e83ffe379b536cccbb95a2eba0c8f35b1ebc3d9c917a6f67b3745e5811fe00dbb2586b005f817ce065f3007ecee6640cdba"

RPROVIDES:${PN} += "python3.9dist-apsw \
python39-apsw \
python3dist-apsw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
python-abi"

inherit rpm
