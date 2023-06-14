SUMMARY = "Scientific Analysis Environment"
DESCRIPTION = "Interactive computing for complex data processing, \
modeling and analysis in Python."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "python310-cauldron-notebook-1.0.9-1.3.noarch.rpm"
RPM_HASH = "2080253bf8d83150c956d528140c623b0cfeab4b38e3d25f270ce5e719d2a9682fe392492fc7d9723914c71ae3a7547d33454b9ed8c6dfbb141de6c92326f7f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cauldron-notebook \
python3.10dist-cauldron-notebook \
python310-cauldron-notebook \
python3dist-cauldron-notebook"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
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
