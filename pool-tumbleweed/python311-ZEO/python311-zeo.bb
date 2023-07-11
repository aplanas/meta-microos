SUMMARY = "Client-Server storage implementation for ZODB"
DESCRIPTION = "ZEO provides a client-server storage implementation for ZODB."
LICENSE = "ZPL-2.1"

PV = "5.4.0"

RPM_NAME = "python311-ZEO-5.4.0-1.3.noarch.rpm"
RPM_HASH = "ec7f12e0709939ea98696b2dddb9117909ff4be848d078f1abeb9769fe9c3542d0199c64373d2eb1a71d28fc7ba4cbfac8832d0597e3607e81fc1d16dbaeed28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ZEO \
python3.11dist-zeo \
python311-ZEO \
python3dist-zeo"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-ZConfig \
python311-ZODB \
python311-persistent \
python311-transaction \
python311-zc.lockfile \
python311-zdaemon \
python311-zope.interface \
update-alternatives"

inherit rpm
