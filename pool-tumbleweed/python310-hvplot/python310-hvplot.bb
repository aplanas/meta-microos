SUMMARY = "High-level plotting API for the PyData ecosystem built on HoloViews"
DESCRIPTION = "hvPlot provides a high-level plotting API built on HoloViews that \
provides a general and consistent API for plotting data in various \
formats from the PyData ecosystem. hvPlot can integrate neatly with \
individual PyData libraries if an extension mechanism for the native \
plot APIs is offered, or it can be used as a standalone component."
LICENSE = "BSD-3-Clause"

PV = "0.8.4"

RPM_NAME = "python310-hvplot-0.8.4-1.1.noarch.rpm"
RPM_HASH = "3bec68739eda5c18888a9bcad9c8531ca042ce0adc66896bb58c2e81c85899dcc960a786bb47ae2c02491ae3836a71878e3c3cbc3d270f24ad3650c2c1a938ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hvplot \
python310-hvplot \
python3dist-hvplot"

RDEPENDS:${PN} += "python-abi \
python310-bokeh \
python310-colorcet \
python310-holoviews \
python310-numpy \
python310-packaging \
python310-pandas \
python310-panel \
python310-param \
update-alternatives"

inherit rpm
