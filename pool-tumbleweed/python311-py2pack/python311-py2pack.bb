SUMMARY = "Script for generating distribution packages from Python packages on PyPI"
DESCRIPTION = "This script allows to generate RPM spec or DEB dsc files from Python modules. \
It allows to list Python modules or search for them on the Python Package Index \
(PyPI). Conveniently, it can fetch tarballs and changelogs making it an \
universal tool to package Python modules."
LICENSE = "Apache-2.0"

PV = "0.9.0"

RPM_NAME = "python311-py2pack-0.9.0-2.3.noarch.rpm"
RPM_HASH = "b99b3e2909110d8eeb5db2c5508df15cb955d4652343f29d6832ffad56d0e54bda7bc263a669fad5cefaaab7e6c80c34cc9d29cf46c92d2eb05ab1d164eedb66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py2pack \
python3.11dist-py2pack \
python311-py2pack \
python3dist-py2pack"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Jinja2 \
python311-metaextract \
python311-pbr \
python311-pypi-search \
python311-requests \
python311-setuptools \
python311-tomli \
update-alternatives"

inherit rpm
