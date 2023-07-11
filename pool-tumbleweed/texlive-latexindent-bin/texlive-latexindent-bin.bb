SUMMARY = "Binary files of latexindent"
DESCRIPTION = "Binary files of latexindent"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32150"

RPM_NAME = "texlive-latexindent-bin-2023.20230311.svn32150-92.1.aarch64.rpm"
RPM_HASH = "2f52f2898b915a7548f863c4822eb7a8fe79385731a809c87920b15ed9be55c63ec4f72d2fe4ed0c4b82b515e353ff567eca4bfc193371f2cceb7656c12fcf2e"

RPROVIDES:${PN} += "texlive-latexindent-bin"

RDEPENDS:${PN} += "texlive-latexindent"

inherit rpm
