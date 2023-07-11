SUMMARY = "Linux Studio Plugins Documentation"
DESCRIPTION = "Documentation for Linux Studio Plugins Project"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "lsp-plugins-doc-1.2.7-1.2.noarch.rpm"
RPM_HASH = "10220d3194e2906cd7d5e6228cc95f11ba3ff09e062e25b9b33f9db36adfef523edf40ce5de84b38fe826bcd08562a5dbe672ee44e87e3202d04d8f6cf9437fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lsp-plugins-doc"

RDEPENDS:${PN} += ""

inherit rpm
