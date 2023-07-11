SUMMARY = "MathJax resources as a Jupyter Server Extension"
DESCRIPTION = "MathJax resources as a Jupyter Server Extension."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "0.2.6"

RPM_NAME = "python310-jupyter-server-mathjax-0.2.6-1.8.noarch.rpm"
RPM_HASH = "d77195f33e5ec51cc1230b56ad0ad3ac3cb74514b8f7380801b03f7f861415a22a430a9bbcc89701f90d69cf77d39c19eb29b27293c2dddc62dbfaa4e0125658"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyter-server-mathjax \
python310-jupyter-server-mathjax \
python3dist-jupyter-server-mathjax"

RDEPENDS:${PN} += "jupyter-server-mathjax \
python-abi \
python310-jupyter-server"

inherit rpm
