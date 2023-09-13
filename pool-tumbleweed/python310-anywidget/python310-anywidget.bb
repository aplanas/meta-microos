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

RPM_NAME = "python310-anywidget-0.6.3-1.1.noarch.rpm"
RPM_HASH = "ed0acdb769ec15018fb995b03a2d06e3a04cff5c46e78102d85d97ce342624371f48c4e6ada85899cad0dd17cb507e8c0d3c19644ad2d1744b275a4e45453c1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-anywidget \
python310-anywidget \
python3dist-anywidget"

RDEPENDS:${PN} += "python-abi \
python310-ipywidgets \
python310-psygnal \
python310-typing-extensions"

inherit rpm
