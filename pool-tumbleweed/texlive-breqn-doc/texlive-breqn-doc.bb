SUMMARY = "Documentation for texlive-breqn"
DESCRIPTION = "This package includes the documentation for texlive-breqn"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.98lsvn60881"

RPM_NAME = "texlive-breqn-doc-2023.209.0.0.98lsvn60881-53.1.noarch.rpm"
RPM_HASH = "024caf4fcb0749a6e3e1d82e57310533df29c24f07d9a66a6535cb81206744b3aab0029d4d1286d8a7a7e63c895b66101990a6b7ec5f722cfa60e71bf80165b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-breqn-doc"

RDEPENDS:${PN} += ""

inherit rpm
