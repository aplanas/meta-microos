SUMMARY = "Hatch plugin for versioning with your preferred VCS"
DESCRIPTION = "This provides a plugin for Hatch that uses your preferred version control system (like Git) to determine project versions."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-hatch_vcs-0.3.0-5.3.noarch.rpm"
RPM_HASH = "715274b1f433e71f43126ca6f7d843cb19b41d9f689f93095b1052c07e44a84b834f91dd3e4b87b0ae1df910bd5ba1fe49c43a5f5ed55bc050af21b445334a92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatch-vcs \
python3.11dist-hatch-vcs \
python311-hatch-vcs \
python3dist-hatch-vcs"

RDEPENDS:${PN} += "-python311-setuptools-scm >= 6.4.0 \
python-abi \
python311-hatchling"

inherit rpm
