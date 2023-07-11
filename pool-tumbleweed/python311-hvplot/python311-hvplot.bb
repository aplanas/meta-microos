SUMMARY = "High-level plotting API for the PyData ecosystem built on HoloViews"
DESCRIPTION = "hvPlot provides a high-level plotting API built on HoloViews that \
provides a general and consistent API for plotting data in various \
formats from the PyData ecosystem. hvPlot can integrate neatly with \
individual PyData libraries if an extension mechanism for the native \
plot APIs is offered, or it can be used as a standalone component."
LICENSE = "BSD-3-Clause"

PV = "0.8.4"

RPM_NAME = "python311-hvplot-0.8.4-1.1.noarch.rpm"
RPM_HASH = "6f58189df96919f9c4a80ca95d3f55a1561b67eff9b0741773c7e44b40ea61a23af6ea26efc9c3fef0eaa9030a0b1b898dabc60d07a2d3f042d517871c5bb17b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hvplot \
python3.11dist-hvplot \
python311-hvplot \
python3dist-hvplot"

RDEPENDS:${PN} += "python-abi \
python311-bokeh \
python311-colorcet \
python311-holoviews \
python311-numpy \
python311-packaging \
python311-pandas \
python311-panel \
python311-param \
update-alternatives"

inherit rpm
