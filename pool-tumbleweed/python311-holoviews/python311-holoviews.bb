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

RPM_NAME = "python311-holoviews-1.16.1-1.1.noarch.rpm"
RPM_HASH = "92f1e5170ac5ceeac92c17b0d4450e7f8b078cfa6590aeb64e84dcfe52b75706d826ad4363c7200bc8ff46c19c32d9407fee2209b3bca840dc72384649c8fd27"
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
