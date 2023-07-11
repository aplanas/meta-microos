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

RPM_NAME = "python311-websockify-0.10.0-3.8.noarch.rpm"
RPM_HASH = "afeea02c83faef34f5cfbf15188f5097d7daf9bd6c60241d8108641a6940976171070e7e596bfb5b15f7bf414d6724b1d15423ec86e9d76fbfa223f7ffb6429e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-websockify \
python3.11dist-websockify \
python311-websockify \
python3dist-websockify"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
