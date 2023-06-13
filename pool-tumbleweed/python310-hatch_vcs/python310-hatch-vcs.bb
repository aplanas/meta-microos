SUMMARY = "Hatch plugin for versioning with your preferred VCS"
DESCRIPTION = "This provides a plugin for Hatch that uses your preferred version control system (like Git) to determine project versions."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-hatch_vcs-0.3.0-5.1.noarch.rpm"
RPM_HASH = "8938e6c6de670d8b708cd61c23e6fff7863f025a0baaf743a3141061b2cf20b3063693fd70bcefed110c8794dad0fc3dd5f9083da1007b1d48913b8a481aed70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatch-vcs \
python3-hatch_vcs \
python3.10dist(hatch-vcs) \
python310-hatch-vcs \
python310-hatch_vcs \
python3dist(hatch-vcs)"

RDEPENDS:${PN} += "(python310-setuptools_scm >= 6.4.0) \
python(abi) \
python310-hatchling"

inherit rpm
