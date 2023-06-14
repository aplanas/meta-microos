SUMMARY = "Client-Server storage implementation for ZODB"
DESCRIPTION = "ZEO provides a client-server storage implementation for ZODB."
LICENSE = "ZPL-2.1"

PV = "5.4.0"

RPM_NAME = "python39-ZEO-5.4.0-1.1.noarch.rpm"
RPM_HASH = "abdeae7318a5de2de19e625a21ccec9013fc5c846a51ca03c5a1d1d064d197a934e91817154d7c195aaa590c6a9082dbbb55995f07568a904488232749f6bfc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zeo \
python39-ZEO \
python3dist-zeo"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
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
