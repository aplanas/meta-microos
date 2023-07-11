SUMMARY = "Applications for the Python acitoolkit library"
DESCRIPTION = "Python applications using acitoolkit for programming ACI."
LICENSE = "Apache-2.0"

PV = "0.4"

RPM_NAME = "python-acitoolkit-doc-applications-0.4-6.1.noarch.rpm"
RPM_HASH = "ed9e9ca92e63812be3ca83eb36ddaf4428845c93082899b291bb42329a2fa26dd713590773c0c6898b2dfee51edf0dfdf9ebb071a8f7664c4dfd320bd5febc2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-acitoolkit-doc-applications"

RDEPENDS:${PN} += "python-acitoolkit-doc \
python3-Flask \
python3-Flask-Admin \
python3-Flask-Bootstrap \
python3-Flask-Cors \
python3-Flask-HTTPAuth \
python3-Flask-SQLAlchemy \
python3-Flask-WTF \
python3-GitPython \
python3-py-radix"

inherit rpm
