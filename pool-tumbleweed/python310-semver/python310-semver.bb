SUMMARY = "Python helper for Semantic Versioning"
DESCRIPTION = "A Python module for semantic versioning. Simplifies comparing versions. \
See also http://semver.org/"
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python310-semver-3.0.1-1.1.noarch.rpm"
RPM_HASH = "f20597e4bc166fe7d22de567c4dfafd3384234f0c6e712720d9a63ccbc16a1e3e16b4a3f14b374aa831b4036dfe082a1b37a667e9b3de889c41589206f4e4ff0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-semver \
python310-semver \
python3dist-semver"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
