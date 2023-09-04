SUMMARY = "A Jupyter widget for dynamic Leaflet maps - Jupyter files"
DESCRIPTION = "A Jupyter / Leaflet bridge enabling interactive maps in the Jupyter notebook. \
 \
This package provides the extensions for jupyter notebook and jupyterlab."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "jupyter-ipyleaflet-0.17.3-3.1.noarch.rpm"
RPM_HASH = "3202737a538a7a908557abf846e3e88dc4fee4b5bb0001afc1e972613e8ff29c31d41cc3616cfd82cf0c7ddf1ea4dc69dbfa5dee3a48e53f5765190329925c72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyleaflet \
jupyter-leaflet"

RDEPENDS:${PN} += "-jupyter-ipywidgets >= 7.6.0 with jupyter-ipywidgets < 9 \
python3dist-ipyleaflet"

inherit rpm
