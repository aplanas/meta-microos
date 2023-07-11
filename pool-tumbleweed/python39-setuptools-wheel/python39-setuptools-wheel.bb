SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "67.8.0"

RPM_NAME = "python39-setuptools-wheel-67.8.0-1.3.noarch.rpm"
RPM_HASH = "caa47674cd128bd38aa47515fc5307307dde89fe5b7b4511e67642ea8b27c0545127f96d0cc37944caa97d479c1cdd7a9b6ae581ea69bbfb4775167a2d79f435"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-setuptools-wheel"

RDEPENDS:${PN} += "python-abi \
update-alternatives"

inherit rpm
