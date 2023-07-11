SUMMARY = "Proxy server that can tunnel among remote servers by regex rules"
DESCRIPTION = "Proxy server that can tunnel among remote servers by regex rules."
LICENSE = "MIT"

PV = "2.7.8"

RPM_NAME = "python311-pproxy-2.7.8-3.1.noarch.rpm"
RPM_HASH = "4f27b6bed8789627b0db69a7d6065a16785decf5901765f9031dca48f808083811ca258d547d75c73239bfddb85add25302cb4628778e52bf201596b28b74cb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pproxy \
python3.11dist-pproxy \
python311-pproxy \
python3dist-pproxy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi"

inherit rpm
