SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "67.7.2"

RPM_NAME = "python39-setuptools-wheel-67.7.2-1.1.noarch.rpm"
RPM_HASH = "80bd6edae92dfa381abc99d2cb948509c1e68c9bbcb0740899ce9314225117af8442ab32829ecc4e6b01edbbcdb5c256a4afa3529db0aa97f8b1dadbfac32dba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-setuptools-wheel"

RDEPENDS:${PN} += "python(abi) \
update-alternatives"

inherit rpm
