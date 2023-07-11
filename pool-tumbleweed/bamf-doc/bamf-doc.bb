SUMMARY = "Documentation for libbamf and libbamf3"
DESCRIPTION = "This package contains the documentation for the bamf library."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "0.5.6"

RPM_NAME = "bamf-doc-0.5.6-1.5.noarch.rpm"
RPM_HASH = "f819f806426fa19d1dd3cbe1fb4b397abacba907903e8a4f56a1b421a1886783b6bff04996f666a56877ebca1418ad07322963ae182b4f572228423f75c0e912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bamf-doc"

RDEPENDS:${PN} += ""

inherit rpm
