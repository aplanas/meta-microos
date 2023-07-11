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

RPM_NAME = "python311-setuptools-git-versioning-1.13.2-3.3.noarch.rpm"
RPM_HASH = "bd051aa6f7eee0cd16332c355edee464541621e064bfc09ce8c9799e921b5e645d97d52ed15113ab66b9eeff398118091a0742ec007aa7ecaad9d89706bc7c5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-git-versioning \
python3.11dist-setuptools-git-versioning \
python311-setuptools-git-versioning \
python3dist-setuptools-git-versioning"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
git-core \
python-abi \
python311-Deprecated \
python311-packaging \
python311-setuptools \
update-alternatives"

inherit rpm
