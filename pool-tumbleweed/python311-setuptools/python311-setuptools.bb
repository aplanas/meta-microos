SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "67.8.0"

RPM_NAME = "python311-setuptools-67.8.0-1.3.noarch.rpm"
RPM_HASH = "7b47fc963c49b09c58ce4552ba2b8470355d00d2d1d2a767f728220a9421144edc2b4da31f805f2321f21a36b2f331b1ba6daaedaec53af1d001100ac3c0df86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools \
python3.11dist-setuptools \
python311-setuptools \
python3dist-setuptools"

RDEPENDS:${PN} += "python-abi \
update-alternatives"

inherit rpm
