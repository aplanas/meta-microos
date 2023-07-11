SUMMARY = "Client-Server storage implementation for ZODB"
DESCRIPTION = "ZEO provides a client-server storage implementation for ZODB."
LICENSE = "ZPL-2.1"

PV = "5.4.0"

RPM_NAME = "python39-ZEO-5.4.0-1.3.noarch.rpm"
RPM_HASH = "f89136663889a7194de5c692d99ffb210975711852421f22e490c0c95cb59488d4fcf6412bf8095fc98566f0e399f335b54c0d4e418fa784a19017bc62726b09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zeo \
python39-ZEO \
python3dist-zeo"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-ZConfig \
python39-ZODB \
python39-persistent \
python39-transaction \
python39-zc.lockfile \
python39-zdaemon \
python39-zope.interface \
update-alternatives"

inherit rpm
