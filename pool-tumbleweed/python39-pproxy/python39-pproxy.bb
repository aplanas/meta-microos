SUMMARY = "Proxy server that can tunnel among remote servers by regex rules"
DESCRIPTION = "Proxy server that can tunnel among remote servers by regex rules."
LICENSE = "MIT"

PV = "2.7.8"

RPM_NAME = "python39-pproxy-2.7.8-2.10.noarch.rpm"
RPM_HASH = "1cd12a1939a7db353ebbdd028ddb45a151854db36064438f24112e4505810a38d2f2a97d92a92ac1ee5285fb854d08f335aa9c3cbd706cef11e364d9cbf47ce3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pproxy) \
python39-pproxy \
python3dist(pproxy)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi)"

inherit rpm
