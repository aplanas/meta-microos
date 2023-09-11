SUMMARY = "HTML Documentation for python-Sphinx"
DESCRIPTION = "Sphinx is a tool that facilitates creating documentation for Python \
projects (or other documents consisting of multiple reStructuredText \
sources). \
 \
This package contains the HTML documentation for Sphinx."
LICENSE = "BSD-2-Clause"

PV = "7.2.4"

RPM_NAME = "python-Sphinx-doc-html-7.2.4-1.1.noarch.rpm"
RPM_HASH = "86bf72602d56b82f9e05f50ecb3e71daf8b1ecd0f9105b8037702b3a4431c61ab558269d8cb529df13358c9240781919f35c6606cb83a195cc073020b5efdfc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Sphinx-doc-html"

RDEPENDS:${PN} += ""

inherit rpm
