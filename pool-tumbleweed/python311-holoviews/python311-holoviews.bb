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

RPM_NAME = "python311-holoviews-1.17.1-1.1.noarch.rpm"
RPM_HASH = "917db6ba92e31f00bb9b6c4dfed4e1b679a7de3a738c3ef42583922870dbc78d7d59792e0d43ae57857120aef094f40a7c9e9df03d22827858c442fbaf561fe0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-holoviews \
python3.11dist-holoviews \
python311-holoviews \
python3dist-holoviews"

RDEPENDS:${PN} += "-python311-param >= 1.12 with python311-param < 3 \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-colorcet \
python311-numpy \
python311-packaging \
python311-pandas \
python311-panel \
python311-pyviz-comms \
update-alternatives"

inherit rpm
