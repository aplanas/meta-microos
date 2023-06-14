SUMMARY = "Persistent dict in Python backed by sqlite3"
DESCRIPTION = "A wrapper around Python's sqlite3 database with a Pythonic \
dict-like interface and support for multi-thread access."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "python311-sqlitedict-1.6.0-3.12.noarch.rpm"
RPM_HASH = "7e83be0bf97deaa7244d5ec7dc0ec10425e0cdbec42fc09eabe7b8b4656492a81c107d8cb9364a87c2a9359a3ecc4f226b8ae3512b38a3d75ad3842dddf91aeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sqlitedict \
python311-sqlitedict \
python3dist-sqlitedict"

RDEPENDS:${PN} += "python-abi \
python311"

inherit rpm
