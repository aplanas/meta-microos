SUMMARY = "Distutils/Setuptools Adapter"
DESCRIPTION = "This package adds support for common build additions to distutils. \
This includes the following: \
 \
  * gettext/i18n \
  * documentation \
  * program icons"
LICENSE = "GPL-2.0-only"

PV = "2.50"

RPM_NAME = "python311-distutils-extra-2.50-1.2.noarch.rpm"
RPM_HASH = "33b77964ce17305b25704875596f55a484b83b958f836af4df322ccec3bc796d4d4749ed3f498f874aff57703858515a1969ea66af7fd22729e23902c57fff21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-distutils-extra \
python3.11dist-python-distutils-extra \
python311-distutils-extra \
python3dist-python-distutils-extra"

RDEPENDS:${PN} += "python-abi"

inherit rpm
