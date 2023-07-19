SUMMARY = "Binary files of latex-git-log"
DESCRIPTION = "Binary files of latex-git-log"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn30983"

RPM_NAME = "texlive-latex-git-log-bin-2023.20230311.svn30983-93.1.aarch64.rpm"
RPM_HASH = "e3ba6fe98f6fa3546bf42626f25169cf1031e18a2d041bbdb622c832b192bd9724cfe945bc50b002be35a38d2425a025928300fa0d1411a32720fd501b0d9d64"

RPROVIDES:${PN} += "texlive-latex-git-log-bin"

RDEPENDS:${PN} += "texlive-latex-git-log"

inherit rpm
