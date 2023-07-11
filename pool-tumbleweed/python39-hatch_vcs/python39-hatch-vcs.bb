SUMMARY = "Hatch plugin for versioning with your preferred VCS"
DESCRIPTION = "This provides a plugin for Hatch that uses your preferred version control system (like Git) to determine project versions."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-hatch_vcs-0.3.0-5.3.noarch.rpm"
RPM_HASH = "97efc20853fe6c7409a50b670ff6daf37d44582457d8ccf0a3a7c57ada1b7d58287a7fd853a9950285b8e6ebdf5cb1738cd36f93fbf8db9164965d533b26cde7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hatch-vcs \
python39-hatch-vcs \
python3dist-hatch-vcs"

RDEPENDS:${PN} += "-python39-setuptools-scm >= 6.4.0 \
python-abi \
python39-hatchling"

inherit rpm
