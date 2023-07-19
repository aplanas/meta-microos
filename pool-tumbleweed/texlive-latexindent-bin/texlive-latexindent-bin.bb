SUMMARY = "Binary files of latexindent"
DESCRIPTION = "Binary files of latexindent"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32150"

RPM_NAME = "texlive-latexindent-bin-2023.20230311.svn32150-93.1.aarch64.rpm"
RPM_HASH = "6ba0b68506297cce0c84869365370469aecaefdb8078f9219e0c4d3951b2e044a04b136f3943a3958d526193c6209d0a7636706f3fac0925f2e673f8edd8b920"

RPROVIDES:${PN} += "texlive-latexindent-bin"

RDEPENDS:${PN} += "texlive-latexindent"

inherit rpm
