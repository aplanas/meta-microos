SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "68.1.2"

RPM_NAME = "python310-setuptools-68.1.2-1.1.noarch.rpm"
RPM_HASH = "e2cfb9447ae2f6a8371657cd4a0b3ceaf313b28edf0426983d6db53e3114fa222a2d684d2c0ad3401bbd6036a0c520ec8b3843b2926591ed4751f3d6bfb9357f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-setuptools \
python310-setuptools \
python3dist-setuptools"

RDEPENDS:${PN} += "python-abi \
update-alternatives"

inherit rpm
