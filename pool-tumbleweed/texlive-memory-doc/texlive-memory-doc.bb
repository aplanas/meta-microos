SUMMARY = "Documentation for texlive-memory"
DESCRIPTION = "This package includes the documentation for texlive-memory"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2svn30452"

RPM_NAME = "texlive-memory-doc-2023.208.1.2svn30452-53.1.noarch.rpm"
RPM_HASH = "2101f6d5231f1e82d0f094265c3128a1ab1196fc42b3fc134ba1444c28509e3394d0b1dd858647346444ef022a4547bfc6b7abdec95a7ce86d2bfef087ea5d7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-memory-doc"

RDEPENDS:${PN} += ""

inherit rpm
