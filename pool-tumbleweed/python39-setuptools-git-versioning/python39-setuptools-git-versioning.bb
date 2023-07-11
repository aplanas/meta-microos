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

RPM_NAME = "python39-setuptools-git-versioning-1.13.2-3.3.noarch.rpm"
RPM_HASH = "1b49017515ba2ab5131c76a4f891716870920a8c62e4f7f88615e4ef05da1669b3fc5c6f4a03eb6da89f0249b609004f52712ec6f06fffafeb6831b13e7b237d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-setuptools-git-versioning \
python39-setuptools-git-versioning \
python3dist-setuptools-git-versioning"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
git-core \
python-abi \
python39-Deprecated \
python39-packaging \
python39-setuptools \
python39-toml \
update-alternatives"

inherit rpm
