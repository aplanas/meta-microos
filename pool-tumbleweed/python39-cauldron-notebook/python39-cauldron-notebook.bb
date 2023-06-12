SUMMARY = "Scientific Analysis Environment"
DESCRIPTION = "Interactive computing for complex data processing, \
modeling and analysis in Python."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "python39-cauldron-notebook-1.0.9-1.3.noarch.rpm"
RPM_HASH = "a4af8b9d3f469583c35b7d5f5a5f2defe2cb5e57f11e793fbfddccafcb763657cd8e3abc540b66a386e6bdd0c23e32f3b3f65c80997c3c5485873619058fab6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cauldron-notebook) \
python39-cauldron-notebook \
python3dist(cauldron-notebook)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-Flask \
python39-Jinja2 \
python39-Markdown \
python39-beautifulsoup4 \
python39-numpy \
python39-pandas \
python39-pygments \
python39-requests \
update-alternatives"

inherit rpm
