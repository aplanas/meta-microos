SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "67.7.2"

RPM_NAME = "python311-setuptools-wheel-67.7.2-1.1.noarch.rpm"
RPM_HASH = "dcd103a9b9c918d897eeb67da4e8dbd9a0804eb12772f79c5c31b538a881365145f72ea4dd35c5daea905a935d0327f84910dae8cb13b164ab4b3cbcd3989f96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-setuptools-wheel"

RDEPENDS:${PN} += "python-abi \
update-alternatives"

inherit rpm
