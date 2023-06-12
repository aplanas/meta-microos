SUMMARY = "High-level plotting API for the PyData ecosystem built on HoloViews"
DESCRIPTION = "hvPlot provides a high-level plotting API built on HoloViews that \
provides a general and consistent API for plotting data in various \
formats from the PyData ecosystem. hvPlot can integrate neatly with \
individual PyData libraries if an extension mechanism for the native \
plot APIs is offered, or it can be used as a standalone component."
LICENSE = "BSD-3-Clause"

PV = "0.8.3"

RPM_NAME = "python39-hvplot-0.8.3-1.1.noarch.rpm"
RPM_HASH = "9cf6c6ad77e03982a0af0ae2634c3244ccde15a6df70f711f76f11e1043642b5308e2250458292cd9ae4ff67a7cac81e3264bd4db779a6e5f932652954dea0e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hvplot) \
python39-hvplot \
python3dist(hvplot)"
RDEPENDS:${PN} += "(python39-bokeh >= 1.0.0 with python39-bokeh < 2.5) \
python(abi) \
python39-colorcet \
python39-holoviews \
python39-numpy \
python39-packaging \
python39-pandas \
python39-panel \
python39-param \
update-alternatives"

inherit rpm
