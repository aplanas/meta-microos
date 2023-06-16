SUMMARY = "A simple Python tool to transfer data from MySQL to SQLite 3"
DESCRIPTION = "A simple Python tool to transfer data from MySQL to SQLite 3"
LICENSE = "MIT"

PV = "v1.4.3"

RPM_NAME = "python310-mysql-to-sqlite3-v1.4.3-1.11.noarch.rpm"
RPM_HASH = "d125734540ecdda88ea38a236894721c5c3c9eaea9b6450911de71cf12fc9dff6dea30aa156f814fc6d29cd7e2baffae35718b8989acc398995c916e7b78f273"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mysql-to-sqlite3 \
python3.10dist-mysql-to-sqlite3 \
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
