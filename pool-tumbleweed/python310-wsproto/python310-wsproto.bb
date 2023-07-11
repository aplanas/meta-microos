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

RPM_NAME = "python310-wsproto-1.2.0-3.3.noarch.rpm"
RPM_HASH = "e1af0f18b53a3c29b6822a3c093b71496ba33c4b5773092cd0c6fe10aa2524922d56eba414835162705f4003e5bad6eee1e5c113c0dec0cb535b2ee44b2b3ec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wsproto \
python310-wsproto \
python3dist-wsproto"

RDEPENDS:${PN} += "python-abi \
python310-h11"

inherit rpm
