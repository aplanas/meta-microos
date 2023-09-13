SUMMARY = "Custom jupyter widgets made easy"
DESCRIPTION = "Custom jupyter widgets made easy \
 \
- create widgets **without complicated cookiecutter templates** \
- **publish to PyPI** like any other Python package \
- prototype **within** `.ipynb` or `.py` files \
- run in **Jupyter**, **JupyterLab**, **Google Colab**, **VSCode**, and more \
- develop with **instant HMR**, like modern web frameworks"
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "python39-anywidget-0.6.3-1.1.noarch.rpm"
RPM_HASH = "315e9bc5f2aeddbb380bf59a1c519baf5d3ae025fd43701b2b748652030dbb148074917938e57566c66cd73da5cf89b69a413d99b0ba93830ac595cb46abbf1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-anywidget \
python39-anywidget \
python3dist-anywidget"

RDEPENDS:${PN} += "python-abi \
python39-ipywidgets \
python39-psygnal \
python39-typing-extensions"

inherit rpm
