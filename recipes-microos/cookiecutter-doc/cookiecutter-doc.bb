SUMMARY = "Documentation files for cookiecutter"
DESCRIPTION = "A command-line utility that creates projects from cookiecutters (project \
templates), e.g. creating a Python package project from a Python package \
project template. \
 \
This package contains the documentation for cookiecutter."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "cookiecutter-doc-2.1.1-1.4.noarch.rpm"
RPM_HASH = "3fc00b846e4cdb9a0990bb9956a33a955e661ae539f96a09b0d2e0cec15d6d55f8a484fa853db7af1dbcbb42a13babe83642ad5ef0b4c810cd177aa274064478"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cookiecutter-doc"
RDEPENDS:${PN} += ""

inherit rpm
