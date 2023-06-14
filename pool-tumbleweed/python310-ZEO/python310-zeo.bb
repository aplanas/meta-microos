SUMMARY = "Client-Server storage implementation for ZODB"
DESCRIPTION = "ZEO provides a client-server storage implementation for ZODB."
LICENSE = "ZPL-2.1"

PV = "5.4.0"

RPM_NAME = "python310-ZEO-5.4.0-1.1.noarch.rpm"
RPM_HASH = "70ac57cf4d7d392020c41b97da5023a619ed1ea35a8aa9ed25ca30763d50a36eb5da7457358364ffbbaf4e85fd797b04eac03b44953e9b220f69b4845aa843cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ZEO \
python3.10dist-zeo \
python310-ZEO \
python3dist-zeo"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-ZConfig \
python310-ZODB \
python310-persistent \
python310-transaction \
python310-zc.lockfile \
python310-zdaemon \
python310-zope.interface \
update-alternatives"

inherit rpm
