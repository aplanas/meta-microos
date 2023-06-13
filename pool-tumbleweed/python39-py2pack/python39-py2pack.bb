SUMMARY = "Script for generating distribution packages from Python packages on PyPI"
DESCRIPTION = "This script allows to generate RPM spec or DEB dsc files from Python modules. \
It allows to list Python modules or search for them on the Python Package Index \
(PyPI). Conveniently, it can fetch tarballs and changelogs making it an \
universal tool to package Python modules."
LICENSE = "Apache-2.0"

PV = "0.9.0"

RPM_NAME = "python39-py2pack-0.9.0-1.1.noarch.rpm"
RPM_HASH = "1b56a92003a74b81481fb88becea042f7873d1b7ad2049c7c0de69d3b31bd30359897aaaefeba63f5c0925155d318d3606c78b07a380c450842091389cfc1552"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(py2pack) \
python39-py2pack \
python3dist(py2pack)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-Jinja2 \
python39-metaextract \
python39-pbr \
python39-pypi-search \
python39-requests \
python39-setuptools \
update-alternatives"

inherit rpm
