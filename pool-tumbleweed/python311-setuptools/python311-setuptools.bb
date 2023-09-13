SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "68.1.2"

RPM_NAME = "python311-setuptools-68.1.2-1.1.noarch.rpm"
RPM_HASH = "088598d7add2a11ed086a76824d22085d054390ec32f94738fdca25ae4ec1cdd41ac536be93143c3f9c27b711677c0de27740e5900ea34f9a28b2b622170eef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools \
python3.11dist-setuptools \
python311-setuptools \
python3dist-setuptools"

RDEPENDS:${PN} += "python-abi \
update-alternatives"

inherit rpm
