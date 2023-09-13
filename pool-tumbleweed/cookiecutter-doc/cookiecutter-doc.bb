SUMMARY = "Documentation files for cookiecutter"
DESCRIPTION = "A command-line utility that creates projects from cookiecutters (project \
templates), e.g. creating a Python package project from a Python package \
project template. \
 \
This package contains the documentation for cookiecutter."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "cookiecutter-doc-2.3.0-1.1.noarch.rpm"
RPM_HASH = "a0961b98795de81b68c40b7b27eb0a52ea8f958be4acbfac76642638852794601655c3380ce161e3a3d48ceff9bb895e8a0a306ebf35ca6a66dc932ff31a4477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cookiecutter-doc"

RDEPENDS:${PN} += ""

inherit rpm
