SUMMARY = "Another Python SQLite Wrapper"
DESCRIPTION = "APSW is a Python wrapper for the SQLite embedded relational database \
engine. In contrast to other wrappers such as pysqlite it focuses on \
being a minimal layer over SQLite attempting just to translate the \
complete SQLite API into Python."
LICENSE = "Zlib"

PV = "3.42.0.0"

RPM_NAME = "python39-apsw-3.42.0.0-2.1.aarch64.rpm"
RPM_HASH = "aead4139cfc86c3ad0e0d728c31442c38f9a636ca260fe90367e44afd0855d8ec6653962386aca8f6b25bc95898512846b48509caa611709325f458277ff8bf3"

RPROVIDES:${PN} += "python3.9dist-apsw \
python39-apsw \
python3dist-apsw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
python-abi"

inherit rpm
