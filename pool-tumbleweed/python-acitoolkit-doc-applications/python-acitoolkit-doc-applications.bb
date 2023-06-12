SUMMARY = "Applications for the Python acitoolkit library"
DESCRIPTION = "Python applications using acitoolkit for programming ACI."
LICENSE = "Apache-2.0"

PV = "0.4"

RPM_NAME = "python-acitoolkit-doc-applications-0.4-5.5.noarch.rpm"
RPM_HASH = "6ecb514609a7b07eaf1228b8db993db1b1fd627bd4167c79ac6f65dad2856f27bf8078e5bc7194e901293415edb9deb095ae29d287f2e2e659397a6b80c02e19"
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
