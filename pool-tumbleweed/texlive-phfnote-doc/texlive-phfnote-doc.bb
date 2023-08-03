SUMMARY = "Documentation for texlive-phfnote"
DESCRIPTION = "This package includes the documentation for texlive-phfnote"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.0svn60733"

RPM_NAME = "texlive-phfnote-doc-2023.209.4.0svn60733-52.1.noarch.rpm"
RPM_HASH = "5112253958ca2a9733437bfef2172c15cc53c5e853cc2133fdbb9d82b7dd79428a6fdaf425ac29b11fb46d0811d9bb7f137b2cb38fce107b22b2b8a7bc81faa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfnote-doc"

RDEPENDS:${PN} += ""

inherit rpm
