SUMMARY = "A Jupyter Server Extension Providing Terminals"
DESCRIPTION = "A Jupyter Server Extension Providing Terminals."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python310-jupyter-server-terminals-0.4.4-1.5.noarch.rpm"
RPM_HASH = "12c4f1e3ae886a25c9a7d6194b4a41b8a31688b60925306f665d07888464f60ca784539661a5804ea63bb23a2dd1afd16a6026ab034b07890c97fe8edc63e1de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyter-server-terminals \
python310-jupyter-server-terminals \
python3dist-jupyter-server-terminals"

RDEPENDS:${PN} += "jupyter-server-terminals \
python-abi \
python310-terminado"

inherit rpm
