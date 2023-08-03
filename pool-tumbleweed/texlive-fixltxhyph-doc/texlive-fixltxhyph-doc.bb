SUMMARY = "Documentation for texlive-fixltxhyph"
DESCRIPTION = "This package includes the documentation for texlive-fixltxhyph"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn25832"

RPM_NAME = "texlive-fixltxhyph-doc-2023.209.0.0.4svn25832-53.1.noarch.rpm"
RPM_HASH = "f46de9b6a8c8be1e1388c33ef6161f5d4299a6fe0e1211e12471fabe5face365d48cf332ad6f4b5de3446a316439f3885dd680c28998ea952f6e9e3720a51d39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fixltxhyph-doc"

RDEPENDS:${PN} += ""

inherit rpm
