SUMMARY = "Another Python SQLite Wrapper"
DESCRIPTION = "APSW is a Python wrapper for the SQLite embedded relational database \
engine. In contrast to other wrappers such as pysqlite it focuses on \
being a minimal layer over SQLite attempting just to translate the \
complete SQLite API into Python."
LICENSE = "Zlib"

PV = "3.42.0.1"

RPM_NAME = "python39-apsw-3.42.0.1-1.1.aarch64.rpm"
RPM_HASH = "9a1ce94fe00863718931ce710345ccff98dc5e5d8eff836d537a5c46d97636c8629e6a0e3e1d948531bff77cf5106619136a77394cc08f784985b49f49fde02d"

RPROVIDES:${PN} += "python3.9dist-apsw \
python39-apsw \
python3dist-apsw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
python-abi"

inherit rpm
