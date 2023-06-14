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

RPM_NAME = "python310-holoviews-1.15.4-1.2.noarch.rpm"
RPM_HASH = "92ef38a19ef938e94571087a839fd46fb4bbef0e766488db99c335677531b427058e0f11d9cb68fe6eb3c5eb53c05e95189ce6d5fd1d4dc65cc8c081a6d700f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-holoviews \
python3.10dist-holoviews \
python310-holoviews \
python3dist-holoviews"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-colorcet \
python310-numpy \
python310-packaging \
python310-pandas \
python310-panel \
python310-param \
python310-pyviz-comms \
update-alternatives"

inherit rpm
