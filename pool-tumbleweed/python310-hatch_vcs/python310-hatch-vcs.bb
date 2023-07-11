SUMMARY = "Hatch plugin for versioning with your preferred VCS"
DESCRIPTION = "This provides a plugin for Hatch that uses your preferred version control system (like Git) to determine project versions."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-hatch_vcs-0.3.0-5.3.noarch.rpm"
RPM_HASH = "b6ef428b3b5447909e7d719e973e89a30ea39bc47ff6e2c7790eeaf963241263325a2c4f82e4736bc8ab39b96309ccb0bd95ae9b75e7d41e6a0b29b66fd243d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hatch-vcs \
python310-hatch-vcs \
python3dist-hatch-vcs"

RDEPENDS:${PN} += "-python310-setuptools-scm >= 6.4.0 \
python-abi \
python310-hatchling"

inherit rpm
