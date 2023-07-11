SUMMARY = "WebSockets state-machine based protocol implementation"
DESCRIPTION = "This module contains a pure-Python implementation of a WebSocket \
protocol stack. It's written from the ground up to be embeddable in \
whatever program you choose to use, ensuring that you can \
communicate via WebSockets, as defined in RFC6455 \
<https://tools.ietf.org/html/rfc6455>, regardless of your \
programming paradigm. \
 \
This module does not provide a parsing layer, a network layer, or \
any rules about concurrency. Instead, it's a purely in-memory \
solution, defined in terms of data actions and WebSocket frames. \
RFC6455 and Compression Extensions for WebSocket via RFC7692 \
<https://tools.ietf.org/html/rfc7692> are fully supported."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-wsproto-1.2.0-3.3.noarch.rpm"
RPM_HASH = "2f3b95190885634d43672550176087145f4be48b4bdaf463c583f0e1194b4bd75ed22decdb136545813dd286c4b4427be46554204ce497d69095361a437fd1ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wsproto \
python3.11dist-wsproto \
python311-wsproto \
python3dist-wsproto"

RDEPENDS:${PN} += "python-abi \
python311-h11"

inherit rpm
