SUMMARY = "Documentation for texlive-sacsymb"
DESCRIPTION = "This package includes the documentation for texlive-sacsymb"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65768"

RPM_NAME = "texlive-sacsymb-doc-2023.209.svn65768-54.1.noarch.rpm"
RPM_HASH = "7328ea8ae2044b0e2a8a5626c3777b07402fe6b598b68abb143bd3f579814247ad16fda508255ba049278a9f89422b20c9abc274dbe6472da06a102200a0c83b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sacsymb-doc"

RDEPENDS:${PN} += ""

inherit rpm
