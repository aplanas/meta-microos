SUMMARY = "Yet Another Framework for Experiments"
DESCRIPTION = "The package yafe offers a generic framework to conduct \
scientific experiments."
LICENSE = "GPL-3.0-only"

PV = "1.0.3"

RPM_NAME = "python310-yafe-1.0.3-2.10.noarch.rpm"
RPM_HASH = "b30f2b83aa77d62c6ed0f3510945bf858716fe2e14216a0796586629c648178a6bbc5bdc5ff1566347d33f0e5941ce290bf86ee0c336754fb255ea03eede59d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-yafe \
python310-yafe \
python3dist-yafe"

RDEPENDS:${PN} += "python-abi \
python310-numpy"

inherit rpm
