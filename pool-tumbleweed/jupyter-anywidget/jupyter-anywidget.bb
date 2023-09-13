SUMMARY = "Custom jupyter widgets made easy"
DESCRIPTION = "- create widgets **without complicated cookiecutter templates** \
- **publish to PyPI** like any other Python package \
- prototype **within** `.ipynb` or `.py` files \
- run in **Jupyter**, **JupyterLab**, **Google Colab**, **VSCode**, and more \
- develop with **instant HMR**, like modern web frameworks \
 \
This package provides the jupyter notebook extensions."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "jupyter-anywidget-0.6.3-1.1.noarch.rpm"
RPM_HASH = "061b97f39afbf837693d4209d708609005402db62f2c58d0b6c9a7029b7ed99f6a6bbdae764c4c43c407c882982a9e0040fb07d31886973dbb7aaf5d7e18d934"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-anywidget"

RDEPENDS:${PN} += "jupyter-ipywidgets \
python3dist-anywidget"

inherit rpm
