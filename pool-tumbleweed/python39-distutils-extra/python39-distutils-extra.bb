SUMMARY = "Distutils/Setuptools Adapter"
DESCRIPTION = "This package adds support for common build additions to distutils. \
This includes the following: \
 \
  * gettext/i18n \
  * documentation \
  * program icons"
LICENSE = "GPL-2.0-only"

PV = "2.50"

RPM_NAME = "python39-distutils-extra-2.50-1.2.noarch.rpm"
RPM_HASH = "6ad1b58e72707bc8cdfa827f44623c6a213bd7cdf93c7859feed46eadc46f96ac281898f85c393dc27d24d2ff99a03f32fdf1b231ca016c246f9703c895e967b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-distutils-extra \
python39-distutils-extra \
python3dist-python-distutils-extra"

RDEPENDS:${PN} += "python-abi"

inherit rpm
