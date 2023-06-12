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

RPM_NAME = "python311-setuptools-git-versioning-1.13.2-2.2.noarch.rpm"
RPM_HASH = "8f5e9a90c8061cafccbb007a33dc65047464bead2a9142c885f26478792336c266d0ebe3980a82a507accb40f7db8fc14c654f533c6a003cc64dfe3832ac37c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(setuptools-git-versioning) \
python311-setuptools-git-versioning \
python311-setuptools_git_versioning \
python3dist(setuptools-git-versioning)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
git-core \
python(abi) \
python311-Deprecated \
python311-packaging \
python311-setuptools \
update-alternatives"

inherit rpm
