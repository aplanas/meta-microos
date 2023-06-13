SUMMARY = "WebSocket client and server library for Python"
DESCRIPTION = "Python library providing an implementation of the WebSocket protocol \
defined in RFC 6455."
LICENSE = "BSD-3-Clause"

PV = "0.5.1"

RPM_NAME = "python39-ws4py-0.5.1-3.5.noarch.rpm"
RPM_HASH = "1f9a90c7fb714ff42aaf65dce17084bdf050f02603128d544519ac0032b57e190030cb0b8fb746bc845c3e2564d261cf1d86755d97fffe9c78c01fdacc9b0998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ws4py) \
python39-ws4py \
python3dist(ws4py)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
