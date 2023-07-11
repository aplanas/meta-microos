SUMMARY = "Python library for plotting charts"
DESCRIPTION = "Chartify is a Python library for creating charts."
LICENSE = "Apache-2.0"

PV = "4.0.2"

RPM_NAME = "python310-chartify-4.0.2-1.3.noarch.rpm"
RPM_HASH = "70e325f08d088972e6c1ccc5b39994076edd6d3b812c65143915711f2f2b637da179775fe733b5ea82df9da0bb0a19d73926d90867d721fdcb71f431a75421fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-chartify \
python310-chartify \
python3dist-chartify"

RDEPENDS:${PN} += "-python3.10dist(scipy) < 2 with python3.10dist(scipy) >= 1.6 \
python-abi \
python3.10dist-bokeh \
python3.10dist-ipykernel \
python3.10dist-ipython \
python3.10dist-jinja2 \
python3.10dist-pandas \
python3.10dist-pillow \
python3.10dist-pyyaml \
python3.10dist-selenium"

inherit rpm
