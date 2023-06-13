SUMMARY = "Documentation for texlive-biblatex-true-citepages-omit"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-true-citepages-omit"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.0svn44653"

RPM_NAME = "texlive-biblatex-true-citepages-omit-doc-2023.201.2.0.0svn44653-53.1.noarch.rpm"
RPM_HASH = "25dc58529c9d48cf1dafebade1f1c176908f0c8e2f8c9973857523eee11d528322bdee5b1e92b7de2b05d9b216ed6ede3525a81e0574c036a78aee267e060537"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-true-citepages-omit-doc"

RDEPENDS:${PN} += ""

inherit rpm
