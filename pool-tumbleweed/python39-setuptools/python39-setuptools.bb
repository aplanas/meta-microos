SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "67.8.0"

RPM_NAME = "python39-setuptools-67.8.0-1.3.noarch.rpm"
RPM_HASH = "4863d4f2d3b01a724b956e9abcc74e5e003d254804ef89c0ef66a38d5603e04d62d0a31994283a4ffc0c0e4b6799d66deacd44baba3ee3e2075cd90b508b3498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-setuptools \
python39-setuptools \
python3dist-setuptools"

RDEPENDS:${PN} += "python-abi \
update-alternatives"

inherit rpm
