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

RPM_NAME = "python311-anywidget-0.6.3-1.1.noarch.rpm"
RPM_HASH = "6b9f210528d90c5799567f10f561ad452f04bec5cbf152997da390e217817a3e2a8996e06cf89cb01540174817106ddcdf34e36d4652100a1bcb922e428f28c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-anywidget \
python3.11dist-anywidget \
python311-anywidget \
python3dist-anywidget"

RDEPENDS:${PN} += "python-abi \
python311-ipywidgets \
python311-psygnal \
python311-typing-extensions"

inherit rpm
