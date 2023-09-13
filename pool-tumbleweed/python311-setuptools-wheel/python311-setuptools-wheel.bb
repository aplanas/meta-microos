SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "68.1.2"

RPM_NAME = "python311-setuptools-wheel-68.1.2-1.1.noarch.rpm"
RPM_HASH = "f1e605d634fd688e919c45f048807bb0f4a8b3c7237e791fc6c873e4f6e6ab02a3ed72c63039597f68ddff0a7d1e34429634fbb878e3a1adf472fb4954d0629b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-wheel \
python311-setuptools-wheel"

RDEPENDS:${PN} += "python-abi \
update-alternatives"

inherit rpm
