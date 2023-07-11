SUMMARY = "Python library for plotting charts"
DESCRIPTION = "Chartify is a Python library for creating charts."
LICENSE = "Apache-2.0"

PV = "4.0.2"

RPM_NAME = "python311-chartify-4.0.2-1.3.noarch.rpm"
RPM_HASH = "9fb6877a8a1febc5c2359323f883c97b454c256f99c4a7d8332dc15dc61c9677d795db0a6b44ddfd5b5c41bd08019a186f25247794d73cb2b0893e3fb393f198"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-chartify \
python3.11dist-chartify \
python311-chartify \
python3dist-chartify"

RDEPENDS:${PN} += "-python3.11dist(scipy) < 2 with python3.11dist(scipy) >= 1.6 \
python-abi \
python3.11dist-bokeh \
python3.11dist-ipykernel \
python3.11dist-ipython \
python3.11dist-jinja2 \
python3.11dist-pandas \
python3.11dist-pillow \
python3.11dist-pyyaml \
python3.11dist-selenium"

inherit rpm
