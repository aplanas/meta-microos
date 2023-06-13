SUMMARY = "Documentation for texlive-pbox"
DESCRIPTION = "This package includes the documentation for texlive-pbox"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.2svn24807"

RPM_NAME = "texlive-pbox-doc-2023.201.1.2svn24807-51.1.noarch.rpm"
RPM_HASH = "417f9f2ce1d90f69ced7a7bf2e7a7390e0fa9040a41fb20727082047fa8638b24cfe4eb108f84388d627cb2e7d3216d453275a9e6dc1ffab8189447bd8404ae1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
