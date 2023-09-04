SUMMARY = "IPython widget for rendering 3d volumes"
DESCRIPTION = "3d plotting for Python in the Jupyter notebook based on IPython widgets using WebGL. \
 \
Ipyvolume currently can \
- Do (multi) volume rendering. \
- Create scatter plots (up to ~1 million glyphs). \
- Create quiver plots (like scatter, but with an arrow pointing in a particular direction). \
- Render isosurfaces. \
- Do lasso mouse selections. \
- Render in the Jupyter notebook, or create a standalone html page (or snippet to embed in your page). \
- Render in stereo, for virtual reality with Google Cardboard. \
- Animate in d3 style, for instance if the x coordinates or color of a scatter plots changes. \
- Animations / sequences, all scatter/quiver plot properties can be a list of arrays, which can represent time snapshots. \
- Stylable (although still basic) \
- Integrates with \
  + ipywidgets for adding gui controls (sliders, button etc), see an example at the documentation homepage \
  + bokeh by linking the selection \
  + bqplot by linking the selection \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "python311-ipyvolume-0.6.3-2.1.noarch.rpm"
RPM_HASH = "db514633db84b2afcde98e9e89b8b9ca5079a045dc4e07c70a3ed8bbff57a96afa655a7dbef786583cab802b4eb0394da9b9cfda4fe87122618c68dbc5e10a4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyvolume \
python3.11dist-ipyvolume \
python311-ipyvolume \
python3dist-ipyvolume"

RDEPENDS:${PN} += "jupyter-ipyvolume \
python-abi \
python311-Pillow \
python311-bqplot \
python311-ipyvue \
python311-ipyvuetify \
python311-ipywebrtc \
python311-ipywidgets \
python311-matplotlib \
python311-numpy \
python311-pythreejs \
python311-requests \
python311-traitlets \
python311-traittypes"

inherit rpm
