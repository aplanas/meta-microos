SUMMARY = "Documentation for texlive-embrac"
DESCRIPTION = "This package includes the documentation for texlive-embrac"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9asvn57814"

RPM_NAME = "texlive-embrac-doc-2023.209.0.0.9asvn57814-54.2.noarch.rpm"
RPM_HASH = "761ec88a84b991a76f055eca11688ba400194e47529aaec2a7dd0c0590f27f1ce4a4e685de6198ce75be20cbd74cc1547ec3db51c80cc6d2be3edae4dc7f3c3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-embrac-doc"

RDEPENDS:${PN} += ""

inherit rpm
