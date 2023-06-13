SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "67.7.2"

RPM_NAME = "python310-setuptools-67.7.2-1.1.noarch.rpm"
RPM_HASH = "6594b1408d69c364330984e17c7c0f1af8a75c5193efa77c406a8cdb0c53cedf5c86d7e3088d45b845149482139c55729aff147e2f7c5f43bcf136e101a3f217"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools \
python3.10dist(setuptools) \
python310-setuptools \
python3dist(setuptools)"

RDEPENDS:${PN} += "python(abi) \
update-alternatives"

inherit rpm
