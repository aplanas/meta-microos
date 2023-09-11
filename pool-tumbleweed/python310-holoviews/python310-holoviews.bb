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

PV = "1.17.1"

RPM_NAME = "python310-holoviews-1.17.1-1.1.noarch.rpm"
RPM_HASH = "94ebc6a07dd8da1064113dc42c40ce63a56a8bf89adc400c0178f60d1f1f3c4324ac2fd619cd22d9a24b4e62e021169c68adfe1ef7ad134f3cce29c5949ab008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-holoviews \
python310-holoviews \
python3dist-holoviews"

RDEPENDS:${PN} += "-python310-param >= 1.12 with python310-param < 3 \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-colorcet \
python310-numpy \
python310-packaging \
python310-pandas \
python310-panel \
python310-pyviz-comms \
update-alternatives"

inherit rpm
