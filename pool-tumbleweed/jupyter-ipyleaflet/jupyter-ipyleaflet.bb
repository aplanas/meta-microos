SUMMARY = "A Jupyter widget for dynamic Leaflet maps - Jupyter files"
DESCRIPTION = "A Jupyter / Leaflet bridge enabling interactive maps in the Jupyter notebook. \
 \
This package provides the extensions for jupyter notebook and jupyterlab."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "jupyter-ipyleaflet-0.17.2-1.5.noarch.rpm"
RPM_HASH = "5981e54fe78795eb1d9147c0da84c4326bfade455e9caf43242a4f2bf79937b8c397d4d0b7ecd9e86490c16f43ac9c0c246de94f63569342c17939f9f96696a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyleaflet \
jupyter-leaflet"

RDEPENDS:${PN} += "-jupyter-ipywidgets >= 7.6.0 with jupyter-ipywidgets < 9 \
python3-ipyleaflet"

inherit rpm
