SUMMARY = "Documentation files for cookiecutter"
DESCRIPTION = "A command-line utility that creates projects from cookiecutters (project \
templates), e.g. creating a Python package project from a Python package \
project template. \
 \
This package contains the documentation for cookiecutter."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "cookiecutter-doc-2.1.1-2.1.noarch.rpm"
RPM_HASH = "edef739d98cc8f8bccbffd0e72eb33b8a6a42dc25fb392bc1c51b5be331ea61fc794e85c5e6d1e00d2a6c49e2404263e38a4a6684158046d8e884d919eb10298"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cookiecutter-doc"

RDEPENDS:${PN} += ""

inherit rpm
