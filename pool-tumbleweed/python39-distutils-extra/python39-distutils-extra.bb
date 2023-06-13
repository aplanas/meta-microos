SUMMARY = "Distutils/Setuptools Adapter"
DESCRIPTION = "This package adds support for common build additions to distutils. \
This includes the following: \
 \
  * gettext/i18n \
  * documentation \
  * program icons"
LICENSE = "GPL-2.0-only"

PV = "2.50"

RPM_NAME = "python39-distutils-extra-2.50-1.1.noarch.rpm"
RPM_HASH = "4abf1bc9fc1282d3e357fd278d1908f592a202c359757bb0aa0108d082ba30caf35e1164d8fa807fb5fb71d3bd23f9d52c16f25e52385de7f67d095e82769013"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-distutils-extra) \
python39-distutils-extra \
python3dist(python-distutils-extra)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
