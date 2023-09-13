SUMMARY = "HTML Documentation for python-Sphinx"
DESCRIPTION = "Sphinx is a tool that facilitates creating documentation for Python \
projects (or other documents consisting of multiple reStructuredText \
sources). \
 \
This package contains the HTML documentation for Sphinx."
LICENSE = "BSD-2-Clause"

PV = "7.2.5"

RPM_NAME = "python-Sphinx-doc-html-7.2.5-1.1.noarch.rpm"
RPM_HASH = "b29008cda3f05059df536639de4db3556fd8e52633e1c1ad73991325ae43e6bf946c57c270d6d33f74d799f89dfb0e29ad97370b7a95a09e0cd4206e2b686a96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Sphinx-doc-html"

RDEPENDS:${PN} += ""

inherit rpm
