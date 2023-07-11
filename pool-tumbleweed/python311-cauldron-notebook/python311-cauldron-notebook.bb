SUMMARY = "Scientific Analysis Environment"
DESCRIPTION = "Interactive computing for complex data processing, \
modeling and analysis in Python."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "python311-cauldron-notebook-1.0.9-1.5.noarch.rpm"
RPM_HASH = "fc419e2e9bac1cd76b298c3d6352874356eca7f7a0421277ff558f98763b303e8b842d864275b833b95d493bc6f2e9fd647467888e3fa3ff338e95426ee60c32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cauldron-notebook \
python3.11dist-cauldron-notebook \
python311-cauldron-notebook \
python3dist-cauldron-notebook"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Flask \
python311-Jinja2 \
python311-Markdown \
python311-beautifulsoup4 \
python311-numpy \
python311-pandas \
python311-pygments \
python311-requests \
update-alternatives"

inherit rpm
