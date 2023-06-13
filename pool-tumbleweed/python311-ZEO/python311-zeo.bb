SUMMARY = "Client-Server storage implementation for ZODB"
DESCRIPTION = "ZEO provides a client-server storage implementation for ZODB."
LICENSE = "ZPL-2.1"

PV = "5.4.0"

RPM_NAME = "python311-ZEO-5.4.0-1.1.noarch.rpm"
RPM_HASH = "31c85a8bf50e3b0f7ff2d8a22ba2bc5784c16fd008c9956ff1a82834dc0a3b603415ec2dadae860254250b77cf3f634e5f960619d9cd361c6c584c3332612da8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(zeo) \
python311-ZEO \
python3dist(zeo)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-ZConfig \
python311-ZODB \
python311-persistent \
python311-transaction \
python311-zc.lockfile \
python311-zdaemon \
python311-zope.interface \
update-alternatives"

inherit rpm
