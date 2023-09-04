SUMMARY = "Libraries and Languages for Jupyter"
DESCRIPTION = "Libraries and Languages for Python and Jupyter. \
 \
This package provides the python interface."
LICENSE = "GPL-3.0-only"

PV = "1.0.6"

RPM_NAME = "python310-calysto-1.0.6-2.15.noarch.rpm"
RPM_HASH = "e7162357f0959c2a34e32218b828ce1f4ca90930c78b4e44fbef221dc0bd01af44c6109b9216a7fd86337e39eea5eee19c7d968b6bc2060cfa3a555219ab5ea2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-calysto \
python310-calysto \
python310-jupyter-calysto \
python3dist-calysto"

RDEPENDS:${PN} += "jupyter-calysto \
python-abi \
python310-CairoSVG \
python310-ipython \
python310-ipywidgets \
python310-metakernel \
python310-numpy \
python310-svgwrite"

inherit rpm
