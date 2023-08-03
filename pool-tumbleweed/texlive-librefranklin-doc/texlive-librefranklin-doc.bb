SUMMARY = "Documentation for texlive-librefranklin"
DESCRIPTION = "This package includes the documentation for texlive-librefranklin"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64441"

RPM_NAME = "texlive-librefranklin-doc-2023.209.svn64441-55.1.noarch.rpm"
RPM_HASH = "72c4496797ae3d0458cc5b59bac11f231758b2e0499a2b4e1e563c52d6d8ef94e7222ed1d44e9dafbbfc66a7888f2d0346c8a97ce1b68a5ab4717a4a4b54a16a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-librefranklin-doc"

RDEPENDS:${PN} += ""

inherit rpm
