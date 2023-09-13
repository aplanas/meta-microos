SUMMARY = "Man files for python-Sphinx"
DESCRIPTION = "Sphinx is a tool that facilitates creating documentation for Python \
projects (or other documents consisting of multiple reStructuredText \
sources). \
 \
This package contains the manual pages for the Sphinx executables."
LICENSE = "BSD-2-Clause"

PV = "7.2.5"

RPM_NAME = "python-Sphinx-doc-man-7.2.5-1.1.noarch.rpm"
RPM_HASH = "b145fc2df3559478da52cfe4f65b39e143488f1be989bf2e0eaf9bc39e3cd6d77d76b598df3732f21b8c43d9c34aeb20f44587a3dfc34e618a739383fe0a4067"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Sphinx-doc-man"

RDEPENDS:${PN} += "python3-Sphinx \
update-alternatives"

inherit rpm
