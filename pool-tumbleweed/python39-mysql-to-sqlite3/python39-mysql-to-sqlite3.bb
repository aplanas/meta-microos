SUMMARY = "A simple Python tool to transfer data from MySQL to SQLite 3"
DESCRIPTION = "A simple Python tool to transfer data from MySQL to SQLite 3"
LICENSE = "MIT"

PV = "v1.4.3"

RPM_NAME = "python39-mysql-to-sqlite3-v1.4.3-1.12.noarch.rpm"
RPM_HASH = "6ee139ef840357c973936891bb5a63b62d33e745bbf060ac5f124b8683d486af2ec98460ad8ad2495caca862cb65e3806d0fdf32954f65704e48a6d1c99cc791"
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
