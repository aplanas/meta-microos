SUMMARY = "A Python tool to transfer data from SQLite 3 to MySQL"
DESCRIPTION = "A Python tool to transfer data from SQLite 3 to MySQL"
LICENSE = "MIT"

PV = "1.4.16"

RPM_NAME = "python310-sqlite3-to-mysql-1.4.16-1.5.noarch.rpm"
RPM_HASH = "6100d6c8c852c737746acfe5b174866bdd59e700d85e3d8774b56f801230f5536e49a9ddf8213020360c8b60d8541cd7c6dabfa413caa2db5a08eb6fcacfdb1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sqlite3-to-mysql \
python3.10dist(sqlite3-to-mysql) \
python310-sqlite3-to-mysql \
python3dist(sqlite3-to-mysql)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-click \
python310-mysql-connector-python \
python310-packaging \
python310-pytimeparse \
python310-simplejson \
python310-six \
python310-tabulate \
python310-tqdm"

inherit rpm
