SUMMARY = "A Python tool to transfer data from SQLite 3 to MySQL"
DESCRIPTION = "A Python tool to transfer data from SQLite 3 to MySQL"
LICENSE = "MIT"

PV = "1.4.16"

RPM_NAME = "python310-sqlite3-to-mysql-1.4.16-1.6.noarch.rpm"
RPM_HASH = "ab4374cc9ad9ff11d2888f31be22f59c0fc077ef2cbedb09a507691e7a9a3ca59ad030e70d4dd3a55a29da972bd57a9e165618d4482eabf3561ada99654cb762"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sqlite3-to-mysql \
python310-sqlite3-to-mysql \
python3dist-sqlite3-to-mysql"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
python310-mysql-connector-python \
python310-packaging \
python310-pytimeparse \
python310-simplejson \
python310-six \
python310-tabulate \
python310-tqdm"

inherit rpm
