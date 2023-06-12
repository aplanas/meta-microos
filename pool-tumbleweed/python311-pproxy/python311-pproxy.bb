SUMMARY = "Proxy server that can tunnel among remote servers by regex rules"
DESCRIPTION = "Proxy server that can tunnel among remote servers by regex rules."
LICENSE = "MIT"

PV = "2.7.8"

RPM_NAME = "python311-pproxy-2.7.8-2.10.noarch.rpm"
RPM_HASH = "5b1b30e98a9bce839ced59a321b5573049c4a238ea19050d66c3d3052f21778f373388c1ff8eeedc0823771d3f2204a9252cf39df38355aaf178fe538e8f4554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pproxy) \
python311-pproxy \
python3dist(pproxy)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi)"

inherit rpm
