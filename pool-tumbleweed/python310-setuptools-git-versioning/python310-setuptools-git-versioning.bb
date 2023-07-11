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

RPM_NAME = "python310-setuptools-git-versioning-1.13.2-3.3.noarch.rpm"
RPM_HASH = "7d404f8fc895dcc7288a5be503ca4a339f1b997b8adbdd34d561e273f75058d68306bdccd0c19162df631da24e68e3f7dc204827ce8fc9a384733184657e6235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-setuptools-git-versioning \
python310-setuptools-git-versioning \
python3dist-setuptools-git-versioning"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
git-core \
python-abi \
python310-Deprecated \
python310-packaging \
python310-setuptools \
python310-toml \
update-alternatives"

inherit rpm
