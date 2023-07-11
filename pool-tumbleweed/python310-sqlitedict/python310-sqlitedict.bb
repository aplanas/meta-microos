SUMMARY = "Persistent dict in Python backed by sqlite3"
DESCRIPTION = "A wrapper around Python's sqlite3 database with a Pythonic \
dict-like interface and support for multi-thread access."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "python310-sqlitedict-1.6.0-3.14.noarch.rpm"
RPM_HASH = "5b12cc871c61f9dce39f254383ad568e6aa4493bda680acd3d19e8da56c8d13640897f8d846515e262ea6e5c3cc29833e0716cc9f799b0e5f31fc4688cbc2b44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sqlitedict \
python310-sqlitedict \
python3dist-sqlitedict"

RDEPENDS:${PN} += "python-abi \
python310"

inherit rpm
