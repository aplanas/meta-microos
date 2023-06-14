SUMMARY = "Persistent dict in Python backed by sqlite3"
DESCRIPTION = "A wrapper around Python's sqlite3 database with a Pythonic \
dict-like interface and support for multi-thread access."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "python310-sqlitedict-1.6.0-3.12.noarch.rpm"
RPM_HASH = "02b7465eeba96966288a628d53a217dd58296a7f40b7c4726437e6c18cb5ba13d7ca6a5d0c95c6aa2998783599035390637040fefd42ee1099079d063ede337c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sqlitedict \
python3.10dist-sqlitedict \
python310-sqlitedict \
python3dist-sqlitedict"

RDEPENDS:${PN} += "python-abi \
python310"

inherit rpm
