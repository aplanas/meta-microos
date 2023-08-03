SUMMARY = "Another Python SQLite Wrapper"
DESCRIPTION = "APSW is a Python wrapper for the SQLite embedded relational database \
engine. In contrast to other wrappers such as pysqlite it focuses on \
being a minimal layer over SQLite attempting just to translate the \
complete SQLite API into Python."
LICENSE = "Zlib"

PV = "3.42.0.1"

RPM_NAME = "python311-apsw-3.42.0.1-1.1.aarch64.rpm"
RPM_HASH = "e8683b18de7e2f6a24216f26d51f8da5cd27d6f93fc77242bc645cb9e966b000143a1f978d04ce464b46a78a1e9f4a5996a7ca5ae864407e0305468b248e21b6"

RPROVIDES:${PN} += "python3-apsw \
python3.11dist-apsw \
python311-apsw \
python3dist-apsw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
python-abi"

inherit rpm
