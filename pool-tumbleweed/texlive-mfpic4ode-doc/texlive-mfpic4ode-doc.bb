SUMMARY = "Documentation for texlive-mfpic4ode"
DESCRIPTION = "This package includes the documentation for texlive-mfpic4ode"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn17745"

RPM_NAME = "texlive-mfpic4ode-doc-2023.209.0.0.4svn17745-55.1.noarch.rpm"
RPM_HASH = "c83f07ffe0be77d67fcfa32bb851ebd2c5bc89f5919393414132cd145383018a7c75a233b768eb9fb46ddc743258af4574d37a59a50a4ec39fc8ca9b9fa64997"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mfpic4ode-doc"

RDEPENDS:${PN} += ""

inherit rpm
