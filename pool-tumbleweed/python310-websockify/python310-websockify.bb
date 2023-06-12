SUMMARY = "WebSocket to TCP proxy/bridge"
DESCRIPTION = "websockify was formerly named wsproxy and was part of the \
noVNC project. \
 \
At the most basic level, websockify just translates WebSockets traffic \
to normal socket traffic. Websockify accepts the WebSockets handshake, \
parses it, and then begins forwarding traffic between the client and \
the target in both directions."
LICENSE = "BSD-2-Clause & LGPL-3.0-only & MPL-2.0 & BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python310-websockify-0.10.0-3.6.noarch.rpm"
RPM_HASH = "4f3a3c614920ebe7565650581f8b067884bcd2cacec6f616bf7451a11483727c5ec4962fd27198b94600f4ff4d0972581e812c4d6228fdcf4f5f860254c48875"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-websockify \
python3.10dist(websockify) \
python310-websockify \
python3dist(websockify)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-setuptools \
update-alternatives"

inherit rpm
