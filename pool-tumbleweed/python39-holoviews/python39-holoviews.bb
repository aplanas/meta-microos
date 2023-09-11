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

RPM_NAME = "python39-holoviews-1.17.1-1.1.noarch.rpm"
RPM_HASH = "c6f5c02b5b58a803d1e39bb6392270d1063ad21bd8713baea92fa2344fd01fcbbc9ad785adcc0bbceb48a398cf2398427b46177de72c93e67690224a65e73684"
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
