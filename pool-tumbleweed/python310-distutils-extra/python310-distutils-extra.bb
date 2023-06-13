SUMMARY = "Distutils/Setuptools Adapter"
DESCRIPTION = "This package adds support for common build additions to distutils. \
This includes the following: \
 \
  * gettext/i18n \
  * documentation \
  * program icons"
LICENSE = "GPL-2.0-only"

PV = "2.50"

RPM_NAME = "python310-distutils-extra-2.50-1.1.noarch.rpm"
RPM_HASH = "fda44ac557bb91e7805e5a905e0a388e90b6eab01ccc018f910499fb55fc96a3be7ef3c96b9faf7e068ed1e7965ae0a9c2960f3d549fc50e09017f6fde830978"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-distutils-extra \
python3.10dist(python-distutils-extra) \
python310-distutils-extra \
python3dist(python-distutils-extra)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
