SUMMARY = "Versioning It with your Version In Git"
DESCRIPTION = "Python Setuptools plugin for automatically determining your package's version \
based on your version control repository's tags. Unlike others, it allows easy \
customization of the version format and even lets you easily override the \
separate functions used for version extraction & calculation."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python310-versioningit-2.2.0-1.5.noarch.rpm"
RPM_HASH = "621b288444cf92f5d1621e01d7ff0f2ef45c4c649b69794ff58479e1830dfa8bb0f09a02c3d37393337f808acd20349cb492e797d9f7def2464b14b505da41ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-versioningit \
python310-versioningit \
python3dist-versioningit"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-packaging \
python310-setuptools \
python310-tomli"

inherit rpm
