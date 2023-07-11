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

RPM_NAME = "python39-websockify-0.10.0-3.8.noarch.rpm"
RPM_HASH = "fcd7668345a66cd9d69da51e1e2ba490181679a1eef70ff37c1743e7374df082011cf8f44113c8ea58e7a9fd84845a853b9f9492d41e630844aede2b334d5e56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-websockify \
python39-websockify \
python3dist-websockify"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
