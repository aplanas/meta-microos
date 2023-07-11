SUMMARY = "Libraries and Languages for Jupyter"
DESCRIPTION = "Libraries and Languages for Python and Jupyter. \
 \
This package provides the python interface."
LICENSE = "GPL-3.0-only"

PV = "1.0.6"

RPM_NAME = "python39-calysto-1.0.6-2.14.noarch.rpm"
RPM_HASH = "cb94c5c93f81084e0985cc4613c3771b01a88146b0c7b4f236b775b66f516e434401686a7c7493405dde42b7ce8dfeb1194a6a7794b3a19430e9d8c31cbff661"
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
