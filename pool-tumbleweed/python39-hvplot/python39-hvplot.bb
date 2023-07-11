SUMMARY = "High-level plotting API for the PyData ecosystem built on HoloViews"
DESCRIPTION = "hvPlot provides a high-level plotting API built on HoloViews that \
provides a general and consistent API for plotting data in various \
formats from the PyData ecosystem. hvPlot can integrate neatly with \
individual PyData libraries if an extension mechanism for the native \
plot APIs is offered, or it can be used as a standalone component."
LICENSE = "BSD-3-Clause"

PV = "0.8.4"

RPM_NAME = "python39-hvplot-0.8.4-1.1.noarch.rpm"
RPM_HASH = "7dde79bafd3603bc8007ff76b4091c3e3bf5d2d08a1d2d90a17d3c750746af2c1a3eafacb469045ca45c335dbafa9000c2036596930f03fecb55961e4bcd7dd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hvplot \
python39-hvplot \
python3dist-hvplot"

RDEPENDS:${PN} += "python-abi \
python39-bokeh \
python39-colorcet \
python39-holoviews \
python39-numpy \
python39-packaging \
python39-pandas \
python39-panel \
python39-param \
update-alternatives"

inherit rpm
