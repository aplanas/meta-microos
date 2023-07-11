SUMMARY = "A simple Python tool to transfer data from MySQL to SQLite 3"
DESCRIPTION = "A simple Python tool to transfer data from MySQL to SQLite 3"
LICENSE = "MIT"

PV = "v1.4.3"

RPM_NAME = "python310-mysql-to-sqlite3-v1.4.3-1.12.noarch.rpm"
RPM_HASH = "60bcf7edf298fd97e39f86bf9f318943f9c9012418b1627212b601ef7cbeca10c999b1db473c7dfeb7f25a3f1db1bdac5c681b10049b1a1fe2a1133ee19d5f9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mysql-to-sqlite3 \
python310-mysql-to-sqlite3 \
python3dist-mysql-to-sqlite3"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
python310-mysql-connector-python \
python310-python-slugify \
python310-pytimeparse \
python310-simplejson \
python310-six \
python310-tabulate \
python310-tqdm"

inherit rpm
