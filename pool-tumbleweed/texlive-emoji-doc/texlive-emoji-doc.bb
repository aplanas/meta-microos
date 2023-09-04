SUMMARY = "Documentation for texlive-emoji"
DESCRIPTION = "This package includes the documentation for texlive-emoji"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.2svn59961"

RPM_NAME = "texlive-emoji-doc-2023.209.0.0.2.2svn59961-54.2.noarch.rpm"
RPM_HASH = "1c90e748353d7da401f559bdd8e111885a5f2e40a49a2cb0afce630d3540c3f0bf0e94549e83b667525fb0b1624472a7b21f39960dd47dfe5841f32bedbf11ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emoji-doc"

RDEPENDS:${PN} += ""

inherit rpm
