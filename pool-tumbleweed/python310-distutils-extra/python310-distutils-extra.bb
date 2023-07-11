SUMMARY = "Distutils/Setuptools Adapter"
DESCRIPTION = "This package adds support for common build additions to distutils. \
This includes the following: \
 \
  * gettext/i18n \
  * documentation \
  * program icons"
LICENSE = "GPL-2.0-only"

PV = "2.50"

RPM_NAME = "python310-distutils-extra-2.50-1.2.noarch.rpm"
RPM_HASH = "e3cb3b9dd962a685861df79eecab43159153807ed0a98addfb90263b24635d990e4a263bea72d9c2a49db4fb7fcd6d2a69968413a0bfbb6254da491aab57eafc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-distutils-extra \
python310-distutils-extra \
python3dist-python-distutils-extra"

RDEPENDS:${PN} += "python-abi"

inherit rpm
