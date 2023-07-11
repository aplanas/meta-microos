SUMMARY = "Documentation files for cookiecutter"
DESCRIPTION = "A command-line utility that creates projects from cookiecutters (project \
templates), e.g. creating a Python package project from a Python package \
project template. \
 \
This package contains the documentation for cookiecutter."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "cookiecutter-doc-2.1.1-2.2.noarch.rpm"
RPM_HASH = "b9dbde9adab4467d33592d870afa867acfffeecfb467f32f04a00cdefa598a9657dd5571939e121117d97157f68aa3ebeb618671bcb3aae07ed348efde3a395d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cookiecutter-doc"

RDEPENDS:${PN} += ""

inherit rpm
