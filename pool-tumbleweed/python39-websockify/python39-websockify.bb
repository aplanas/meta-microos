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

RPM_NAME = "python39-websockify-0.10.0-3.6.noarch.rpm"
RPM_HASH = "627d41a75608d60d599d45fe0c0343d175a0c1577e64b0913a74e8df9b8b2bb0e6ce2dbdd20df6f3a3c25b50602adcc4245519b895a3ec729dd21d0cad54fa74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(websockify) \
python39-websockify \
python3dist(websockify)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-setuptools \
update-alternatives"

inherit rpm
