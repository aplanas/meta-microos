SUMMARY = "A Python tool to transfer data from SQLite 3 to MySQL"
DESCRIPTION = "A Python tool to transfer data from SQLite 3 to MySQL"
LICENSE = "MIT"

PV = "1.4.16"

RPM_NAME = "python311-sqlite3-to-mysql-1.4.16-1.5.noarch.rpm"
RPM_HASH = "7a89983c302ac582f418c581de36bd87fab4286c15e0f542091fbcb5f427f5cb759830b4d50e33835aa5152015639253113048df87317bcebe132000398dd685"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sqlite3-to-mysql \
python311-sqlite3-to-mysql \
python3dist-sqlite3-to-mysql"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
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
