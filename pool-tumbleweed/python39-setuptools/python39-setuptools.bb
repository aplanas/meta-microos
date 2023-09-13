SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "68.1.2"

RPM_NAME = "python39-setuptools-68.1.2-1.1.noarch.rpm"
RPM_HASH = "a3c46c5e87bd1cda05d0e3a1dc042677b08a31f4bfc349d9ed24e95fae430e3e8aaca035532f5c3cc42108c0fc6003d80e2889f9db12c54886b9e6ea71a74036"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-setuptools \
python39-setuptools \
python3dist-setuptools"

RDEPENDS:${PN} += "python-abi \
update-alternatives"

inherit rpm
