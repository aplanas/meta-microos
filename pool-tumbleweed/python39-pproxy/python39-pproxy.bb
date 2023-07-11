SUMMARY = "Proxy server that can tunnel among remote servers by regex rules"
DESCRIPTION = "Proxy server that can tunnel among remote servers by regex rules."
LICENSE = "MIT"

PV = "2.7.8"

RPM_NAME = "python39-pproxy-2.7.8-3.1.noarch.rpm"
RPM_HASH = "11370b2f605677f4920011e1866743336cf12f9153270c5c5a91664b95c169dc09a8774a4bc3c63cf9277cc252a07e25f96276ba04cffb170c044728137941cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pproxy \
python39-pproxy \
python3dist-pproxy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi"

inherit rpm
