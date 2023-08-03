SUMMARY = "Documentation for texlive-multenum"
DESCRIPTION = "This package includes the documentation for texlive-multenum"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21775"

RPM_NAME = "texlive-multenum-doc-2023.209.svn21775-55.1.noarch.rpm"
RPM_HASH = "3ab004ac2e2494ef9a0e3ac90625d83eaa614ec9cd6a711e752b65aaa76b44d71ebee5ee536fc133ebc24efc4cc59725ec07a3133e538c668633cd7f91c58d6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multenum-doc"

RDEPENDS:${PN} += ""

inherit rpm
