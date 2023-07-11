SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "67.8.0"

RPM_NAME = "python310-setuptools-wheel-67.8.0-1.3.noarch.rpm"
RPM_HASH = "649d04835325ca8c0046449319b151149abfda609ad40ff4a3a8707234ca8b3c8bdeaf1777f11eababc8733db8c34500d382780fa57451aca8767532a3576325"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-setuptools-wheel"

RDEPENDS:${PN} += "python-abi \
update-alternatives"

inherit rpm
