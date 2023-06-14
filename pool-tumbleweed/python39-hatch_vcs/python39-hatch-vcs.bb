SUMMARY = "Hatch plugin for versioning with your preferred VCS"
DESCRIPTION = "This provides a plugin for Hatch that uses your preferred version control system (like Git) to determine project versions."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-hatch_vcs-0.3.0-5.1.noarch.rpm"
RPM_HASH = "81719b2e674b2d17cf2f338159ba2c06e3aa40d1c32d6c7eac760a8534266d1bcb92c3b3f46b0babae01680c2d631dd536c0e4336f62b331c13d84de9a9cad75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hatch-vcs \
python39-hatch-vcs \
python3dist-hatch-vcs"

RDEPENDS:${PN} += "-python39-setuptools-scm >= 6.4.0 \
python-abi \
python39-hatchling"

inherit rpm
