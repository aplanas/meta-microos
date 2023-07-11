SUMMARY = "Scientific Analysis Environment"
DESCRIPTION = "Interactive computing for complex data processing, \
modeling and analysis in Python."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "python39-cauldron-notebook-1.0.9-1.5.noarch.rpm"
RPM_HASH = "4dc1478cf235d4e078314c755aeabf48e35f58170b428a985d8faf7503a294c752429635b725e77dc7b178d340e093dfaa9b86fd123d7589e7f9eca64be23c85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cauldron-notebook \
python39-cauldron-notebook \
python3dist-cauldron-notebook"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
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
