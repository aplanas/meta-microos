SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "68.1.2"

RPM_NAME = "python39-setuptools-wheel-68.1.2-1.1.noarch.rpm"
RPM_HASH = "b83a4008f39fe9038ff4eeb16abe5bae96ed30e98f28af677214d49ab6f47f1c7bdd29627af7294aca3eff3c3c3b4244b97e614787987e5b930210a9f6724f16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-setuptools-wheel"

RDEPENDS:${PN} += "python-abi \
update-alternatives"

inherit rpm
