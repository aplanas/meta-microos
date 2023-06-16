SUMMARY = "A simple Python tool to transfer data from MySQL to SQLite 3"
DESCRIPTION = "A simple Python tool to transfer data from MySQL to SQLite 3"
LICENSE = "MIT"

PV = "v1.4.3"

RPM_NAME = "python39-mysql-to-sqlite3-v1.4.3-1.11.noarch.rpm"
RPM_HASH = "8e7803427ac0995e7a0ff523edab6b4ba9b2ff2c9eccedc90c25267ac4317559a1ebb47f212338011979840df017a702d3954be0ccda6302f4f6b42d0a193780"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mysql-to-sqlite3 \
python39-mysql-to-sqlite3 \
python3dist-mysql-to-sqlite3"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
python39-mysql-connector-python \
python39-python-slugify \
python39-pytimeparse \
python39-simplejson \
python39-six \
python39-tabulate \
python39-tqdm"

inherit rpm
