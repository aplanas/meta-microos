SUMMARY = "A Python tool to transfer data from SQLite 3 to MySQL"
DESCRIPTION = "A Python tool to transfer data from SQLite 3 to MySQL"
LICENSE = "MIT"

PV = "1.4.16"

RPM_NAME = "python39-sqlite3-to-mysql-1.4.16-1.6.noarch.rpm"
RPM_HASH = "ae20cfd3d607e3600a00b660f0ce10b2eba7370d1b01a56d4bc242c1cf77bc7eeb3001fbf8ba32df5acba211265426b11845113c5096e792be6d342e520ea7dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sqlite3-to-mysql \
python39-sqlite3-to-mysql \
python3dist-sqlite3-to-mysql"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
python39-mysql-connector-python \
python39-packaging \
python39-pytimeparse \
python39-simplejson \
python39-six \
python39-tabulate \
python39-tqdm"

inherit rpm
