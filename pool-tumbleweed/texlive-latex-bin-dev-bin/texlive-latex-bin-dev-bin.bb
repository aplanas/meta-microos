SUMMARY = "Binary files of latex-bin-dev"
DESCRIPTION = "Binary files of latex-bin-dev"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53999"

RPM_NAME = "texlive-latex-bin-dev-bin-2023.20230311.svn53999-92.1.aarch64.rpm"
RPM_HASH = "5325eef6b0379baa3d51343d26ccb4eb74c01b6482b4accad182abfb367f3c169935dfc73356d0841131a898b4b2b25d66d9e09122ed896c3ed4c8b0397235dd"

RPROVIDES:${PN} += "texlive-latex-bin-dev-bin"

RDEPENDS:${PN} += "texlive-latex-bin-dev"

inherit rpm
