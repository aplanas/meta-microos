SUMMARY = "Man files for python-Sphinx"
DESCRIPTION = "Sphinx is a tool that facilitates creating documentation for Python \
projects (or other documents consisting of multiple reStructuredText \
sources). \
 \
This package contains the manual pages for the Sphinx executables."
LICENSE = "BSD-2-Clause"

PV = "7.0.1"

RPM_NAME = "python-Sphinx-doc-man-7.0.1-1.3.noarch.rpm"
RPM_HASH = "263c2d92a07c452fa0ce67dec7dfc5156164ec608a118aea5eedad8700b91e937c294576ca6b3582c5ef43bc5894fe49d5880141bed3fbbe73e73141c5e0a9db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Sphinx-doc-man"

RDEPENDS:${PN} += "python3-Sphinx \
update-alternatives"

inherit rpm
