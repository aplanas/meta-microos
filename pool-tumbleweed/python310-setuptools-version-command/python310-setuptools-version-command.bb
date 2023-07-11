SUMMARY = "Adds a command to dynamically get the version from the VCS of choice"
DESCRIPTION = "Adds a command to dynamically get the version from the VCS of choice."
LICENSE = "MIT"

PV = "99.9"

RPM_NAME = "python310-setuptools-version-command-99.9-1.5.noarch.rpm"
RPM_HASH = "3fe9c763ab800cca461496283f64a1fbf086667417ea98d25b396fa43d19017aa17b3a6f7ab0b610077a4667556fdefc5bdb0c7a9180573f682181f75c68805b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-setuptools-version-command \
python310-setuptools-version-command \
python3dist-setuptools-version-command"

RDEPENDS:${PN} += "python-abi \
python310-setuptools"

inherit rpm
