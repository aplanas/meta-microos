SUMMARY = "WebSocket client and server library for Python"
DESCRIPTION = "Python library providing an implementation of the WebSocket protocol \
defined in RFC 6455."
LICENSE = "BSD-3-Clause"

PV = "0.5.1"

RPM_NAME = "python310-ws4py-0.5.1-3.6.noarch.rpm"
RPM_HASH = "1b2fcffce4eac6cea8b545e5d7959e3bc6ea4d552430c6e41ee5ce5aadf0644dedb024b8b3e58a9a7dcac82e7f749f1a0fd818571d9468eeea9a145549ac3233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ws4py \
python310-ws4py \
python3dist-ws4py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
