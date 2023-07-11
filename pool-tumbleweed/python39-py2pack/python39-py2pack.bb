SUMMARY = "Script for generating distribution packages from Python packages on PyPI"
DESCRIPTION = "This script allows to generate RPM spec or DEB dsc files from Python modules. \
It allows to list Python modules or search for them on the Python Package Index \
(PyPI). Conveniently, it can fetch tarballs and changelogs making it an \
universal tool to package Python modules."
LICENSE = "Apache-2.0"

PV = "0.9.0"

RPM_NAME = "python39-py2pack-0.9.0-2.3.noarch.rpm"
RPM_HASH = "531cfca260a706367529262d317cc32b75130a5fc60a1fabf950263a65af44be82c1eb958ea29bf9d92743c62b1ba22134f271eb70d04f027d392f1c06ea6032"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-py2pack \
python39-py2pack \
python3dist-py2pack"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Jinja2 \
python39-metaextract \
python39-pbr \
python39-pypi-search \
python39-requests \
python39-setuptools \
python39-tomli \
update-alternatives"

inherit rpm
