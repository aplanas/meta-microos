SUMMARY = "Script for generating distribution packages from Python packages on PyPI"
DESCRIPTION = "This script allows to generate RPM spec or DEB dsc files from Python modules. \
It allows to list Python modules or search for them on the Python Package Index \
(PyPI). Conveniently, it can fetch tarballs and changelogs making it an \
universal tool to package Python modules."
LICENSE = "Apache-2.0"

PV = "0.9.0"

RPM_NAME = "python311-py2pack-0.9.0-1.1.noarch.rpm"
RPM_HASH = "cbd8e964db26428d9e052275f34c633e2684c492ca48c4e73c64a7d2ffcd0047858759b54447a9b675b3d6fafd8160a653cd72616669b9310a26d792aaffb373"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(py2pack) \
python311-py2pack \
python3dist(py2pack)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-Jinja2 \
python311-metaextract \
python311-pbr \
python311-pypi-search \
python311-requests \
python311-setuptools \
update-alternatives"

inherit rpm
