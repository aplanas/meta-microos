SUMMARY = "Documentation for texlive-fixme"
DESCRIPTION = "This package includes the documentation for texlive-fixme"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.5svn63708"

RPM_NAME = "texlive-fixme-doc-2023.209.4.5svn63708-53.1.noarch.rpm"
RPM_HASH = "762b7c118f8022452d7c53f4be38647b7988301974dff5875a1386fe34c739fb81583b2799d1bd3c614a2b4671450f3025439e8b4821b11d5e5a1c5a682be480"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fixme-doc"

RDEPENDS:${PN} += ""

inherit rpm
