SUMMARY = "Python library for plotting charts"
DESCRIPTION = "Chartify is a Python library for creating charts."
LICENSE = "Apache-2.0"

PV = "4.0.2"

RPM_NAME = "python39-chartify-4.0.2-1.3.noarch.rpm"
RPM_HASH = "9c82dbae5062775f014267f83695e31ca8adc3525098b318907fabf1d1e08d7c85f98385ab831afe550baa426509401e43c7a7f6b83b4f92b86c85ddff451c62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-chartify \
python39-chartify \
python3dist-chartify"

RDEPENDS:${PN} += "-python3.9dist(scipy) < 2 with python3.9dist(scipy) >= 1.6 \
python-abi \
python3.9dist-bokeh \
python3.9dist-ipykernel \
python3.9dist-ipython \
python3.9dist-jinja2 \
python3.9dist-pandas \
python3.9dist-pillow \
python3.9dist-pyyaml \
python3.9dist-selenium"

inherit rpm
