SUMMARY = "Documentation for texlive-fontawesome"
DESCRIPTION = "This package includes the documentation for texlive-fontawesome"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.6.3.2svn48145"

RPM_NAME = "texlive-fontawesome-doc-2023.209.4.6.3.2svn48145-53.1.noarch.rpm"
RPM_HASH = "a707e74a3f2045340de44fa37e9f4c358942b38b066886287ada0662e191ce3fba2afcc2b7f19634a902a7b6a03f7b55bf60347ebb4f89d9192faaca3aab85c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontawesome-doc"

RDEPENDS:${PN} += ""

inherit rpm
