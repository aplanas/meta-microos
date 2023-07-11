SUMMARY = "WebSocket client and server library for Python"
DESCRIPTION = "Python library providing an implementation of the WebSocket protocol \
defined in RFC 6455."
LICENSE = "BSD-3-Clause"

PV = "0.5.1"

RPM_NAME = "python311-ws4py-0.5.1-3.6.noarch.rpm"
RPM_HASH = "ed7e11c199f14c3c317124d4424aa74b221d05d23ed19fe07979ec9c5f995b96967aa3e75e35b9bdd4c195a1da3257ff93d88abff27a5ee5763faede78d4aa96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ws4py \
python3.11dist-ws4py \
python311-ws4py \
python3dist-ws4py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
