SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "67.8.0"

RPM_NAME = "python311-setuptools-wheel-67.8.0-1.3.noarch.rpm"
RPM_HASH = "35c40ad551c1928e2a1e471dd75182a9216845faa543ff85158763b01973abff69c7e4cf8d195a061f4d31011ba0ca145198bc3a4a53ee3e892d56da9174c692"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-wheel \
python311-setuptools-wheel"

RDEPENDS:${PN} += "python-abi \
update-alternatives"

inherit rpm
