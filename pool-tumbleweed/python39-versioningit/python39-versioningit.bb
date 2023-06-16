SUMMARY = "Versioning It with your Version In Git"
DESCRIPTION = "Python Setuptools plugin for automatically determining your package's version \
based on your version control repository's tags. Unlike others, it allows easy \
customization of the version format and even lets you easily override the \
separate functions used for version extraction & calculation."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python39-versioningit-2.2.0-1.4.noarch.rpm"
RPM_HASH = "4880b76e283d51ac417f07710efb76b847182cb3db4952d8cc02ff19ecd13308ad9ede4fcb4de1def3e7bba0b2d5ce287554ed6e5dd950d9b608cc3216f15d84"
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
