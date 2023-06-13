SUMMARY = "Statistical interactive HTML plots for Python"
DESCRIPTION = "Bokeh is a Python interactive visualization library that targets web \
browsers for presentation. It provides concise construction of \
graphics in the style of D3.js, and favors delivering this capability \
with interactivity over large or streaming datasets."
LICENSE = "BSD-3-Clause"

PV = "3.1.1"

RPM_NAME = "python311-bokeh-3.1.1-1.1.noarch.rpm"
RPM_HASH = "cd288d173fa91a30f051fc2ff55d9d8df4aca4fd643ec05ab3514acd51fcd620f5711c8e5e6da0cbceee91206fa54657f9c2fb48dee63aa93a0c9ccca8e5751f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(bokeh) \
python311-bokeh \
python3dist(bokeh)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-Jinja2 \
python311-Pillow \
python311-PyYAML \
python311-base \
python311-contourpy \
python311-numpy \
python311-packaging \
python311-pandas \
python311-tornado \
python311-xyzservices \
update-alternatives"

inherit rpm
