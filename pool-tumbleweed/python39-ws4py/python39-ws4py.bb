SUMMARY = "WebSocket client and server library for Python"
DESCRIPTION = "Python library providing an implementation of the WebSocket protocol \
defined in RFC 6455."
LICENSE = "BSD-3-Clause"

PV = "0.5.1"

RPM_NAME = "python39-ws4py-0.5.1-3.6.noarch.rpm"
RPM_HASH = "243ba4e07d4ba8cd7bf4bf92234c8756c79038529b45232bb455899db0bbf790859e2fb332459b3e25b4f2e0ade3a2d44213d2ef7a8bf9e4b6c0f0cfc6542a1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ws4py \
python39-ws4py \
python3dist-ws4py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
