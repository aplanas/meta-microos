SUMMARY = "Use git repo data for building a version number according PEP-440"
DESCRIPTION = "Use git repo data (latest tag, current commit hash, etc) for building a \
version number according PEP440. \
 \
  - Can be installed & configured through both `setup.py` and :PEP518's `pyproject.toml` \
  - Does not require to change source code of the project \
  - Tag-, file-, and callback-based versioning schemas are supported \
  - Templates for *tag*, *dev* and *dirty* versions are separated \
  - Templates support a lot of substitutions including git and environment information"
LICENSE = "MIT"

PV = "1.13.2"

RPM_NAME = "python310-setuptools-git-versioning-1.13.2-2.2.noarch.rpm"
RPM_HASH = "e5619fdad477b80e0fdf94d72a298e0e3372c0b7c2c2a1f4c5b9e13c30677161bc69d49774860d63e9fe286c2df01b5b1438f6f3b9c7e261af49e88e1b2dfa85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-git-versioning \
python3.10dist-setuptools-git-versioning \
python310-setuptools-git-versioning \
python3dist-setuptools-git-versioning"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
git-core \
python-abi \
python310-Deprecated \
python310-packaging \
python310-setuptools \
python310-toml \
update-alternatives"

inherit rpm
