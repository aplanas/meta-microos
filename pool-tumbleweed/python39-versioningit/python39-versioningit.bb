SUMMARY = "Versioning It with your Version In Git"
DESCRIPTION = "Python Setuptools plugin for automatically determining your package's version \
based on your version control repository's tags. Unlike others, it allows easy \
customization of the version format and even lets you easily override the \
separate functions used for version extraction & calculation."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python39-versioningit-2.2.0-1.5.noarch.rpm"
RPM_HASH = "8a58d52f9975707950f77745aacc63e7b3fd4db4dcdbacd2a4a9cdff7d8a51f1789a006f9b90baf585ebd1aa3fbf430e42272da29b0d22fe4fd15ed958ca3d98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-versioningit \
python39-versioningit \
python3dist-versioningit"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-packaging \
python39-setuptools \
python39-tomli"

inherit rpm
