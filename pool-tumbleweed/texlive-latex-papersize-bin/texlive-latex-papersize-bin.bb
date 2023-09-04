SUMMARY = "Binary files of latex-papersize"
DESCRIPTION = "Binary files of latex-papersize"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn42296"

RPM_NAME = "texlive-latex-papersize-bin-2023.20230311.svn42296-93.2.aarch64.rpm"
RPM_HASH = "0a596c6830e6cf0374647470a5697d48cac55ff27b82461216b4c7e921eaf3fc4276e74ecc3211f7d9a955858168a6b3edc0e2e9297305caa4f33f2b48606243"

RPROVIDES:${PN} += "texlive-latex-papersize-bin"

RDEPENDS:${PN} += "texlive-latex-papersize"

inherit rpm
