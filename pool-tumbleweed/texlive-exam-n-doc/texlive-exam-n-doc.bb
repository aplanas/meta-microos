SUMMARY = "Documentation for texlive-exam-n"
DESCRIPTION = "This package includes the documentation for texlive-exam-n"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4.0svn64674"

RPM_NAME = "texlive-exam-n-doc-2023.209.1.4.0svn64674-53.1.noarch.rpm"
RPM_HASH = "678ee320c881f46f59128706e4533d2e101df27d279f4b6d1eeabfe6716b96118c362692be601592838c2000f519e20c75c9c1ce9a47b10bc107f7228560c18f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exam-n-doc"

RDEPENDS:${PN} += ""

inherit rpm
