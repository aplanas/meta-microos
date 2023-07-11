SUMMARY = "Another Python SQLite Wrapper"
DESCRIPTION = "APSW is a Python wrapper for the SQLite embedded relational database \
engine. In contrast to other wrappers such as pysqlite it focuses on \
being a minimal layer over SQLite attempting just to translate the \
complete SQLite API into Python."
LICENSE = "Zlib"

PV = "3.42.0.0"

RPM_NAME = "python310-apsw-3.42.0.0-2.1.aarch64.rpm"
RPM_HASH = "9c5a4c8741d779f868a70d07b71ed1394ded24d2721682dc3f64f03d29c8890b3b92b7b06d0c030cabc528a0c6b215997b81bdd693bd2a60023bf8c9ec64eaa9"

RPROVIDES:${PN} += "python3.10dist-apsw \
python310-apsw \
python3dist-apsw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
python-abi"

inherit rpm
