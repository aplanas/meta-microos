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

RPM_NAME = "python39-wsproto-1.2.0-3.3.noarch.rpm"
RPM_HASH = "40d7ad02688d0bc2fa6dc655dd0a709bac7a4370dff92adb2b96931b7dafaf7a6aae7d1d15de7be2509050027ea6d04a08ea39f25c8b391654488107d30c1994"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wsproto \
python39-wsproto \
python3dist-wsproto"

RDEPENDS:${PN} += "python-abi \
python39-h11"

inherit rpm
