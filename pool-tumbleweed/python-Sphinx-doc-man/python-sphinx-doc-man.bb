SUMMARY = "Man files for python-Sphinx"
DESCRIPTION = "Sphinx is a tool that facilitates creating documentation for Python \
projects (or other documents consisting of multiple reStructuredText \
sources). \
 \
This package contains the manual pages for the Sphinx executables."
LICENSE = "BSD-2-Clause"

PV = "7.2.4"

RPM_NAME = "python-Sphinx-doc-man-7.2.4-1.1.noarch.rpm"
RPM_HASH = "e206434cd6214b3df94059eb28983303482c1536f4fbd2fa1141ba92b7386b133a5617681cfb79836e724bb19867ecfecb4d969778c0e47951c25f397dd190bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Sphinx-doc-man"

RDEPENDS:${PN} += "python3-Sphinx \
update-alternatives"

inherit rpm
