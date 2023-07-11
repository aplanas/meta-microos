SUMMARY = "A Python tool to transfer data from SQLite 3 to MySQL"
DESCRIPTION = "A Python tool to transfer data from SQLite 3 to MySQL"
LICENSE = "MIT"

PV = "1.4.16"

RPM_NAME = "python311-sqlite3-to-mysql-1.4.16-1.6.noarch.rpm"
RPM_HASH = "880bd52d75c0a5c143a407e86e0c4dd5f6aaf637ecb871de78bb2b2230618f1cd1bca28de5209278da45910b54bc7a0cb9245a10e370db7581c888be81c9210c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sqlite3-to-mysql \
python3.11dist-sqlite3-to-mysql \
python311-sqlite3-to-mysql \
python3dist-sqlite3-to-mysql"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
python311-mysql-connector-python \
python311-packaging \
python311-pytimeparse \
python311-simplejson \
python311-six \
python311-tabulate \
python311-tqdm"

inherit rpm
