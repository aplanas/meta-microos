SUMMARY = "A Jupyter widget for dynamic Leaflet maps - Jupyter files"
DESCRIPTION = "A Jupyter / Leaflet bridge enabling interactive maps in the Jupyter notebook. \
 \
This package provides the extensions for jupyter notebook and jupyterlab."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "jupyter-ipyleaflet-0.17.3-1.2.noarch.rpm"
RPM_HASH = "d297fe844ba6e7a98b1b744f3a3e3ef3126820db1ea9625ee29152a8c443f8312d91c1fef7488acd1d29ca3f15319b5ef7ab1d0b7bfcdd96fdaa81fdb177773f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyleaflet \
jupyter-leaflet"

RDEPENDS:${PN} += "-jupyter-ipywidgets >= 7.6.0 with jupyter-ipywidgets < 9 \
python3dist-ipyleaflet"

inherit rpm
