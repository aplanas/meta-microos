SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "68.1.2"

RPM_NAME = "python310-setuptools-wheel-68.1.2-1.1.noarch.rpm"
RPM_HASH = "abf3f0a2d787744c9d732bfcaf852ca7f3251abb7e335461be33ec83045482b00ba89a704afe23b29437f605ac228913baa5c1907826685f8a68e12612c78225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-setuptools-wheel"

RDEPENDS:${PN} += "python-abi \
update-alternatives"

inherit rpm
