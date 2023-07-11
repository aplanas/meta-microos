SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "67.8.0"

RPM_NAME = "python310-setuptools-67.8.0-1.3.noarch.rpm"
RPM_HASH = "ccf1dd2f9759956a5cd4ae085a48dcc1f4a6cf4e364a88bcfb961031f01fddbc1d9df46c64099aa75373dd72ed9d0b2f82e45c5cba3dac4c2d2f9b05c3e94b0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-setuptools \
python310-setuptools \
python3dist-setuptools"

RDEPENDS:${PN} += "python-abi \
update-alternatives"

inherit rpm
