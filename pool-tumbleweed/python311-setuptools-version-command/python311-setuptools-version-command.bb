SUMMARY = "Adds a command to dynamically get the version from the VCS of choice"
DESCRIPTION = "Adds a command to dynamically get the version from the VCS of choice."
LICENSE = "MIT"

PV = "99.9"

RPM_NAME = "python311-setuptools-version-command-99.9-1.5.noarch.rpm"
RPM_HASH = "61a634e2ea9aa485fe517456a247c478e0d23eb8f9b5a20af779692ff14500a170c28e09b8a2c8883e918570acd0255df2b99a44bbaea2b740c80dedebe28899"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-version-command \
python3.11dist-setuptools-version-command \
python311-setuptools-version-command \
python3dist-setuptools-version-command"

RDEPENDS:${PN} += "python-abi \
python311-setuptools"

inherit rpm
