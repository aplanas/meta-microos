SUMMARY = "Script for generating distribution packages from Python packages on PyPI"
DESCRIPTION = "This script allows to generate RPM spec or DEB dsc files from Python modules. \
It allows to list Python modules or search for them on the Python Package Index \
(PyPI). Conveniently, it can fetch tarballs and changelogs making it an \
universal tool to package Python modules."
LICENSE = "Apache-2.0"

PV = "0.9.0"

RPM_NAME = "python310-py2pack-0.9.0-2.3.noarch.rpm"
RPM_HASH = "9eb741f890369cdfa80ad4950dd234842d1a0275a6cc3bb3224ed113895b7c5e1687fd3ab7f31c1eb754d796f92af94d939c7fe4da116afbd2862758328f7156"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-py2pack \
python310-py2pack \
python3dist-py2pack"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Jinja2 \
python310-metaextract \
python310-pbr \
python310-pypi-search \
python310-requests \
python310-setuptools \
python310-tomli \
update-alternatives"

inherit rpm
