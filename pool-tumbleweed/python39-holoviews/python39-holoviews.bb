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

PV = "1.15.4"

RPM_NAME = "python39-holoviews-1.15.4-1.2.noarch.rpm"
RPM_HASH = "553ce8578401fb0d9db2183f98f89fd789900191cb9a3bdcea527fa1d92d2af52b0e2b49f85707b52946cc5acbbe2760b3b9cc06f9b2b046611af7c6ca7a3753"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(holoviews) \
python39-holoviews \
python3dist(holoviews)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-colorcet \
python39-numpy \
python39-packaging \
python39-pandas \
python39-panel \
python39-param \
python39-pyviz-comms \
update-alternatives"

inherit rpm
