SUMMARY = "A simple Python tool to transfer data from MySQL to SQLite 3"
DESCRIPTION = "A simple Python tool to transfer data from MySQL to SQLite 3"
LICENSE = "MIT"

PV = "v1.4.3"

RPM_NAME = "python311-mysql-to-sqlite3-v1.4.3-1.11.noarch.rpm"
RPM_HASH = "4d68a9bcd66ee7642660e188d6ed915029568b82df130d8ef9716c1c38666ade9498cbc35f83ac201df2b2744530c17cd54188670f412ea3568ef294c0ce1703"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-mysql-to-sqlite3 \
python311-mysql-to-sqlite3 \
python3dist-mysql-to-sqlite3"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
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
