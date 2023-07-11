SUMMARY = "A simple Python tool to transfer data from MySQL to SQLite 3"
DESCRIPTION = "A simple Python tool to transfer data from MySQL to SQLite 3"
LICENSE = "MIT"

PV = "v1.4.3"

RPM_NAME = "python311-mysql-to-sqlite3-v1.4.3-1.12.noarch.rpm"
RPM_HASH = "f580429a838ea21e656ee649a10acfdf36cf9b95c9dc8aac4428015a6b2eedbf0d17b1d954573aa21a4f0621e67a4d9184f6a77e1ebc2431d904447eaaed0be4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mysql-to-sqlite3 \
python3.11dist-mysql-to-sqlite3 \
python311-mysql-to-sqlite3 \
python3dist-mysql-to-sqlite3"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
python311-mysql-connector-python \
python311-python-slugify \
python311-pytimeparse \
python311-simplejson \
python311-six \
python311-tabulate \
python311-tqdm"

inherit rpm
