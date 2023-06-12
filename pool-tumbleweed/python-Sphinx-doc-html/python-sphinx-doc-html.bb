SUMMARY = "HTML Documentation for python-Sphinx"
DESCRIPTION = "Sphinx is a tool that facilitates creating documentation for Python \
projects (or other documents consisting of multiple reStructuredText \
sources). \
 \
This package contains the HTML documentation for Sphinx."
LICENSE = "BSD-2-Clause"

PV = "7.0.1"

RPM_NAME = "python-Sphinx-doc-html-7.0.1-1.2.noarch.rpm"
RPM_HASH = "beff6d38e42882d5252b63af2e4b86eacd5d25ac9f583ab1cce750dcc1e1c3015b746e43e4e759d0db901fb3409465ea6917fb67765a6ad21e04e1a8b5e680b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Sphinx-doc-html"
RDEPENDS:${PN} += ""

inherit rpm
