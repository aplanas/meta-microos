SUMMARY = "Python library for plotting charts"
DESCRIPTION = "Chartify is a Python library for creating charts."
LICENSE = "Apache-2.0"

PV = "3.0.5"

RPM_NAME = "python310-chartify-3.0.5-1.4.noarch.rpm"
RPM_HASH = "88b850d9e17063e1b58981ad5960d4648d49988ba5f9714e4152d3dacf3772bd70413ae8f997c32bc7229d29a14b2dd24705d3170654ae11010ff49b012dc12f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-chartify \
python3.10dist(chartify) \
python310-chartify \
python3dist(chartify)"

RDEPENDS:${PN} += "(python3.10dist(bokeh) < 2.5 with python3.10dist(bokeh) >= 2) \
(python3.10dist(pandas) < 2 with python3.10dist(pandas) >= 1) \
(python3.10dist(scipy) < 2 with python3.10dist(scipy) >= 1) \
python(abi) \
python3.10dist(ipykernel) \
python3.10dist(ipython) \
python3.10dist(jinja2) \
python3.10dist(pillow) \
python3.10dist(pyyaml) \
python3.10dist(selenium)"

inherit rpm
