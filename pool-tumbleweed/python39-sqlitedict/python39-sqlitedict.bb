SUMMARY = "Persistent dict in Python backed by sqlite3"
DESCRIPTION = "A wrapper around Python's sqlite3 database with a Pythonic \
dict-like interface and support for multi-thread access."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "python39-sqlitedict-1.6.0-3.14.noarch.rpm"
RPM_HASH = "956de6fd5300424177e63d470f1e9dabd8fc7dd808b6de3c9fda89a3b408945bdca470bfdf2bb86ffb446b778960aee76fc0178cefab0abf0f5c8d977133ee3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sqlitedict \
python39-sqlitedict \
python3dist-sqlitedict"

RDEPENDS:${PN} += "python-abi \
python39"

inherit rpm
