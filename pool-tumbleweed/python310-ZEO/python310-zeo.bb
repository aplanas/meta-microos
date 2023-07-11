SUMMARY = "Client-Server storage implementation for ZODB"
DESCRIPTION = "ZEO provides a client-server storage implementation for ZODB."
LICENSE = "ZPL-2.1"

PV = "5.4.0"

RPM_NAME = "python310-ZEO-5.4.0-1.3.noarch.rpm"
RPM_HASH = "e3bd1346d31eee5574afa4a2825db5036c1dfe775dcaa48c7956adc6daa4b1d8365425d5bc3f9b424d9b0ee1aec1f5b57a853de503e424e8ecd59b5c417cc7c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zeo \
python310-ZEO \
python3dist-zeo"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
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
