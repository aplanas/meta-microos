SUMMARY = "Tools and API to assist with translation and software localization -- API docs"
DESCRIPTION = "The translate-toolkit-devel-doc package contains Translate Toolkit API documentation for developers wishing to build new tools for the \
toolkit or to use the libraries in other localization tools."
LICENSE = "GPL-2.0-or-later"

PV = "3.8.6"

RPM_NAME = "translate-toolkit-devel-doc-3.8.6-1.4.noarch.rpm"
RPM_HASH = "533366106cfcadba2141f34946662d97a1d2f938a232a7fc288ad61078c3da1e373a7a2a466928faa3092bce3711c482a01bf63c33d393cc0aa62bc8c1be7e11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "translate-toolkit-devel \
translate-toolkit-devel-doc"

RDEPENDS:${PN} += "translate-toolkit \
translate-toolkit-doc"

inherit rpm
