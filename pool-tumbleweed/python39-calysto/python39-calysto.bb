SUMMARY = "Libraries and Languages for Jupyter"
DESCRIPTION = "Libraries and Languages for Python and Jupyter. \
 \
This package provides the python interface."
LICENSE = "GPL-3.0-only"

PV = "1.0.6"

RPM_NAME = "python39-calysto-1.0.6-2.15.noarch.rpm"
RPM_HASH = "d196bf6384a8cefd1c496d11617065a86d98dcca24ab8cbb5fb11ad6c0083de0631fa7223cc4ef2801b9007d024aa06ec628beddc11e4f592eff33113b15629a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-calysto \
python39-calysto \
python39-jupyter-calysto \
python3dist-calysto"

RDEPENDS:${PN} += "jupyter-calysto \
python-abi \
python39-CairoSVG \
python39-ipython \
python39-ipywidgets \
python39-metakernel \
python39-numpy \
python39-svgwrite"

inherit rpm
