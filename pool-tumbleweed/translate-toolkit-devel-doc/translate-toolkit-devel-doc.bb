SUMMARY = "Tools and API to assist with translation and software localization -- API docs"
DESCRIPTION = "The translate-toolkit-devel-doc package contains Translate Toolkit API documentation for developers wishing to build new tools for the \
toolkit or to use the libraries in other localization tools."
LICENSE = "GPL-2.0-or-later"

PV = "3.8.6"

RPM_NAME = "translate-toolkit-devel-doc-3.8.6-1.2.noarch.rpm"
RPM_HASH = "e2bcac07be8d2cfc72e47479b5a9f66e88c6f044fbe882783798c2170d01a3e247fb247669a69b486b518dfeeba10596e1abff984a38cf135ccf69644b6a7604"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "translate-toolkit-devel \
translate-toolkit-devel-doc"
RDEPENDS:${PN} += "translate-toolkit \
translate-toolkit-doc"

inherit rpm
