SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "67.7.2"

RPM_NAME = "python39-setuptools-67.7.2-1.1.noarch.rpm"
RPM_HASH = "eb6715a43c1fa584b8f1cc3c62e6c36ea150db9dee121149326ddc9771788466b0461bc8604566fc66d2fe9cb0b7b958196cdde4867545a55b45ec863120bfd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(setuptools) \
python39-setuptools \
python3dist(setuptools)"
RDEPENDS:${PN} += "python(abi) \
update-alternatives"

inherit rpm
