SUMMARY = "MathJax resources as a Jupyter Server Extension"
DESCRIPTION = "MathJax resources as a Jupyter Server Extension."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "0.2.6"

RPM_NAME = "python39-jupyter-server-mathjax-0.2.6-1.8.noarch.rpm"
RPM_HASH = "a4e18c24d3b94fae762dcdb9025f009ad871e84daf691c22ed861f18f61c88bfb3d6e234e1d8d4a64d046b70a1ddec0b19e4304752d38261f27c811b5f0c10cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyter-server-mathjax \
python39-jupyter-server-mathjax \
python3dist-jupyter-server-mathjax"

RDEPENDS:${PN} += "jupyter-server-mathjax \
python-abi \
python39-jupyter-server"

inherit rpm
