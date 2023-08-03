SUMMARY = "Documentation files for cookiecutter"
DESCRIPTION = "A command-line utility that creates projects from cookiecutters (project \
templates), e.g. creating a Python package project from a Python package \
project template. \
 \
This package contains the documentation for cookiecutter."
LICENSE = "BSD-3-Clause"

PV = "2.2.3"

RPM_NAME = "cookiecutter-doc-2.2.3-1.1.noarch.rpm"
RPM_HASH = "62cb9ee97229ff67c7a172621bb1b6b43ef4b851acff723cfdcc8ce9fb4f969f4e1581d78f00ff6abf4e86b3e1028ac08cd01446f8c47d8453fde2e643997c21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cookiecutter-doc"

RDEPENDS:${PN} += ""

inherit rpm
