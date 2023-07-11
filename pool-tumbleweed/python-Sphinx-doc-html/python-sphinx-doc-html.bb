SUMMARY = "HTML Documentation for python-Sphinx"
DESCRIPTION = "Sphinx is a tool that facilitates creating documentation for Python \
projects (or other documents consisting of multiple reStructuredText \
sources). \
 \
This package contains the HTML documentation for Sphinx."
LICENSE = "BSD-2-Clause"

PV = "7.0.1"

RPM_NAME = "python-Sphinx-doc-html-7.0.1-1.3.noarch.rpm"
RPM_HASH = "a76c87407cdb95802ee3070ea5d7954167dab3087ee78516ae57f6d3cc9e8526d9b22df1b393afd2e659490521e964664739c0314122a369ce79b47ad19109f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Sphinx-doc-html"

RDEPENDS:${PN} += ""

inherit rpm
