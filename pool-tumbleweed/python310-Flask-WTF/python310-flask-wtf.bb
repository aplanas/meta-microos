SUMMARY = "WTForms support for Flask"
DESCRIPTION = "Adds WTForms support to your Flask application"
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python310-Flask-WTF-1.1.1-1.1.noarch.rpm"
RPM_HASH = "326d89f4132180fa17a0c7bcf94b973f203e73c0646c19b1c6575d3b0a976fddafbad13e25d4b32e2bdbf9204e7de56f9d7df8109c6983b1698a36b9306bfbf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-wtf \
python310-Flask-WTF \
python3dist-flask-wtf"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-WTForms \
python310-Werkzeug \
python310-itsdangerous"

inherit rpm
