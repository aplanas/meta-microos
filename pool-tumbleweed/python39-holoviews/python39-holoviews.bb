SUMMARY = "Composable, declarative visualizations for Python"
DESCRIPTION = "HoloViews is a Python library for automated plotting of annotated \
data. \
 \
Instead of building a plot using direct calls to a plotting library, \
the developer instead first describes the data with semantic \
information and then additional metadata to determine more detailed \
aspects of the visualization. This approach provides automatic \
visualization that can be requested at any time as the data evolves, \
rendered automatically by one of the supported plotting libraries \
(such as Bokeh or Matplotlib)."
LICENSE = "BSD-3-Clause"

PV = "1.16.1"

RPM_NAME = "python39-holoviews-1.16.1-1.1.noarch.rpm"
RPM_HASH = "3f851a0569c17223898baf131e1eafd449756cd659764c9e7a29c568aa9a897e532703d4924e8684b6da859eaed216454e0125aa99d9dabd8e2a35d6bccf5d44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-holoviews \
python39-holoviews \
python3dist-holoviews"

RDEPENDS:${PN} += "-python39-param >= 1.12 with python39-param < 3 \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-colorcet \
python39-numpy \
python39-packaging \
python39-pandas \
python39-panel \
python39-pyviz-comms \
update-alternatives"

inherit rpm
