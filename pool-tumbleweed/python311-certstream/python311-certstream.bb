SUMMARY = "Python library for receiving certificate transparency list updates"
DESCRIPTION = "Certstream is a library to connect to the certstream network (certstream.calidog.io). \
 \
It supports automatic reconnection when networks issues occur, and should be stable for long-running jobs."
LICENSE = "MIT"

PV = "1.12"

RPM_NAME = "python311-certstream-1.12-1.9.noarch.rpm"
RPM_HASH = "72eeb7b2f536cd37fae3ce3d48df42d06370a2251ce710f39d4890bd6eba55f3a30ee84d60ae0523c1b04e425636126c0dee945ab631eee545e8558122147c9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(certstream) \
python311-certstream \
python3dist(certstream)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python3-termcolor \
python3-websocket-client \
update-alternatives"

inherit rpm
