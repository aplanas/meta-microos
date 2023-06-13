SUMMARY = "Python library for plotting charts"
DESCRIPTION = "Chartify is a Python library for creating charts."
LICENSE = "Apache-2.0"

PV = "3.0.5"

RPM_NAME = "python311-chartify-3.0.5-1.4.noarch.rpm"
RPM_HASH = "7f0f19491ab9bbcaf24f061fd7d4f2728c747045ad92b75728d31229f7d9ae0600d156fee9bb2996d03c23e34a7fd309dae4ef0fda9efda1c5bb601800327b0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(chartify) \
python311-chartify \
python3dist(chartify)"

RDEPENDS:${PN} += "(python3.11dist(bokeh) < 2.5 with python3.11dist(bokeh) >= 2) \
(python3.11dist(pandas) < 2 with python3.11dist(pandas) >= 1) \
(python3.11dist(scipy) < 2 with python3.11dist(scipy) >= 1) \
python(abi) \
python3.11dist(ipykernel) \
python3.11dist(ipython) \
python3.11dist(jinja2) \
python3.11dist(pillow) \
python3.11dist(pyyaml) \
python3.11dist(selenium)"

inherit rpm
