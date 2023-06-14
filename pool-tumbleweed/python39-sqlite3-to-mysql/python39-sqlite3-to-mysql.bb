SUMMARY = "A Python tool to transfer data from SQLite 3 to MySQL"
DESCRIPTION = "A Python tool to transfer data from SQLite 3 to MySQL"
LICENSE = "MIT"

PV = "1.4.16"

RPM_NAME = "python39-sqlite3-to-mysql-1.4.16-1.5.noarch.rpm"
RPM_HASH = "50bdcc5bd07e67bec6f8f400a8f256c3596dd668e9769ee314398651adf31b549bdf078493dad770f73012adab77f3911d8f35f8a4a601bfed322ad377d43c73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sqlite3-to-mysql \
python39-sqlite3-to-mysql \
python3dist-sqlite3-to-mysql"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
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
