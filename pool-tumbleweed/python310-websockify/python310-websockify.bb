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

RPM_NAME = "python310-websockify-0.10.0-3.8.noarch.rpm"
RPM_HASH = "d3903f82a37008f5d92dbbb155a50a3e74677539a64aa20b467420b0f750fc6274ab596461abbe56c1660499c8452540b468cbdab9c6e218fee801acdb1a8b88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-websockify \
python310-websockify \
python3dist-websockify"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
