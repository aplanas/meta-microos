SUMMARY = "Python helper for Semantic Versioning"
DESCRIPTION = "A Python module for semantic versioning. Simplifies comparing versions. \
See also http://semver.org/"
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python311-semver-3.0.1-1.1.noarch.rpm"
RPM_HASH = "71155f6c103cf5c25221481e97f9d08297e86a06d7a1ea3ca82bc60e7b48a6b544ef35e5061e1e68705eeb11f8eef5536ab4051d478ae48bfe9661885c446d03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-semver \
python3.11dist-semver \
python311-semver \
python3dist-semver"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
