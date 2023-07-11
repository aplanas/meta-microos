SUMMARY = "MathJax resources as a Jupyter Server Extension"
DESCRIPTION = "MathJax resources as a Jupyter Server Extension."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "0.2.6"

RPM_NAME = "python311-jupyter-server-mathjax-0.2.6-1.8.noarch.rpm"
RPM_HASH = "71c73b0988e742985f0074ecd5931c058fd7e65f059920d8c61de60518d6cb87e5fdc796ce83bb0d4fcee4679f318d1d4e7846b24eee61bf25337641249dcdb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-server-mathjax \
python3.11dist-jupyter-server-mathjax \
python311-jupyter-server-mathjax \
python3dist-jupyter-server-mathjax"

RDEPENDS:${PN} += "jupyter-server-mathjax \
python-abi \
python311-jupyter-server"

inherit rpm
