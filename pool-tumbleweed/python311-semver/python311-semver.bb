SUMMARY = "Python helper for Semantic Versioning"
DESCRIPTION = "A Python module for semantic versioning. Simplifies comparing versions. \
See also http://semver.org/"
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python311-semver-3.0.0-1.1.noarch.rpm"
RPM_HASH = "7f111340706246fece90461133733bf661df96d9e8405472033aa44eb3cc3ebb0ce40e47c130bade844b66a9706b5af54a4743a880874ce12da1017980b485ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(semver) \
python311-semver \
python3dist(semver)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
