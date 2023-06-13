SUMMARY = "High-level plotting API for the PyData ecosystem built on HoloViews"
DESCRIPTION = "hvPlot provides a high-level plotting API built on HoloViews that \
provides a general and consistent API for plotting data in various \
formats from the PyData ecosystem. hvPlot can integrate neatly with \
individual PyData libraries if an extension mechanism for the native \
plot APIs is offered, or it can be used as a standalone component."
LICENSE = "BSD-3-Clause"

PV = "0.8.3"

RPM_NAME = "python310-hvplot-0.8.3-1.1.noarch.rpm"
RPM_HASH = "d738584d67f1568b87543a582005e329668d86527ff7617ee2dcca71ddbf4ebe1e1cb38e17224dcd0cd7f881acaf5d92525a38a02acd34f29a283ab4cbe3cbb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hvplot \
python3.10dist(hvplot) \
python310-hvplot \
python3dist(hvplot)"

RDEPENDS:${PN} += "(python310-bokeh >= 1.0.0 with python310-bokeh < 2.5) \
python(abi) \
python310-colorcet \
python310-holoviews \
python310-numpy \
python310-packaging \
python310-pandas \
python310-panel \
python310-param \
update-alternatives"

inherit rpm
