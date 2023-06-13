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

RPM_NAME = "python311-websockify-0.10.0-3.6.noarch.rpm"
RPM_HASH = "e51ba437a96a733f9db1ddc6c7b77acc6744a2c7e6e85fdfa0e344fedbe85f0e8eb8c3a72c24686f9c95aaddf6b98c7eee557638b7586ccf207eaffe5dd65b2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(websockify) \
python311-websockify \
python3dist(websockify)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-setuptools \
update-alternatives"

inherit rpm
