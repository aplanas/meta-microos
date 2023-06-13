SUMMARY = "MathJax resources as a Jupyter Server Extension"
DESCRIPTION = "MathJax resources as a Jupyter Server Extension."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "0.2.6"

RPM_NAME = "python311-jupyter-server-mathjax-0.2.6-1.7.noarch.rpm"
RPM_HASH = "d85ef6d8e9e8dc0c80f60134e4e422a7f6695e68e0b580a9a3a7019c64d6af50dc8002835c4a618ff2c9e41eada82dd4b0c55db342bde6eb50350d0cfdcae648"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jupyter-server-mathjax) \
python311-jupyter-server-mathjax \
python3dist(jupyter-server-mathjax)"

RDEPENDS:${PN} += "jupyter-server-mathjax \
python(abi) \
python311-jupyter_server"

inherit rpm
