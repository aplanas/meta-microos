SUMMARY = "Persistent dict in Python backed by sqlite3"
DESCRIPTION = "A wrapper around Python's sqlite3 database with a Pythonic \
dict-like interface and support for multi-thread access."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "python311-sqlitedict-1.6.0-3.14.noarch.rpm"
RPM_HASH = "42653f06767ade7f78422c433d6dfd2bbe5353234aec94b6ec615f151369ef89a653d0c54e4d3058f9f59f6f26a9445bab88932e98600e8271063e2d45e8192d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sqlitedict \
python3.11dist-sqlitedict \
python311-sqlitedict \
python3dist-sqlitedict"

RDEPENDS:${PN} += "python-abi \
python311"

inherit rpm
