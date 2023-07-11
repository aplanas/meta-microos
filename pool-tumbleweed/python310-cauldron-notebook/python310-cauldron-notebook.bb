SUMMARY = "Scientific Analysis Environment"
DESCRIPTION = "Interactive computing for complex data processing, \
modeling and analysis in Python."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "python310-cauldron-notebook-1.0.9-1.5.noarch.rpm"
RPM_HASH = "f934bbe45f17174f75ce3d175738a2531aa19b1adf1f8da3427c07b549436d81a3fc3465dd02e491ef6df2199f40e39634cc6a15b432e41a5e240b17b9938ec9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cauldron-notebook \
python310-cauldron-notebook \
python3dist-cauldron-notebook"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Flask \
python310-Jinja2 \
python310-Markdown \
python310-beautifulsoup4 \
python310-numpy \
python310-pandas \
python310-pygments \
python310-requests \
update-alternatives"

inherit rpm
