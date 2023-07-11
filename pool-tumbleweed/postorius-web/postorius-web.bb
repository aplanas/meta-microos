SUMMARY = "The webroot for GNU Mailman"
DESCRIPTION = "A web user interface for GNU Mailman. \
 \
This package holds the web interface."
LICENSE = "GPL-3.0-only"

PV = "1.3.8"

RPM_NAME = "postorius-web-1.3.8-3.1.noarch.rpm"
RPM_HASH = "f194e1210a80f648f186042128171e84c402551cdb3e467b4efc449c46aba4352af853ad4fae7f7c15debbc87549aa742b000c3667f3238814c0ee3dfe04857c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-postorius-web \
postorius-web"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.11 \
/usr/bin/sh \
acl \
openssl \
postorius \
sudo"

inherit rpm
