SUMMARY = "Documentation for texlive-sseq"
DESCRIPTION = "This package includes the documentation for texlive-sseq"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.01svn31585"

RPM_NAME = "texlive-sseq-doc-2023.209.2.01svn31585-58.1.noarch.rpm"
RPM_HASH = "4aaa0ccda41cd69fc8eae20cf63c80c1416950659a804c43722696eca475e0aee1f4a89d69d8fa23516351a69b9ef68be0740d3afc13f680737c52b7086fdbed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sseq-doc"

RDEPENDS:${PN} += ""

inherit rpm
