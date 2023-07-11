SUMMARY = "Python helper for Semantic Versioning"
DESCRIPTION = "A Python module for semantic versioning. Simplifies comparing versions. \
See also http://semver.org/"
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python39-semver-3.0.1-1.1.noarch.rpm"
RPM_HASH = "46996601adbff05af9af9e0829f112323960721405b0b4637db37d6a755354e5159bfa9d1c192f49917b41ca01a083d4acf0c8d7feb81004f214871e55bc666d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-semver \
python39-semver \
python3dist-semver"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
