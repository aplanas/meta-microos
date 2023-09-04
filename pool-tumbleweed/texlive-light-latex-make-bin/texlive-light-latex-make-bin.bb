SUMMARY = "Binary files of light-latex-make"
DESCRIPTION = "Binary files of light-latex-make"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn56352"

RPM_NAME = "texlive-light-latex-make-bin-2023.20230311.svn56352-93.2.aarch64.rpm"
RPM_HASH = "734097146ccb1a23ccd649de28d32156602fff6d9a7598037b11353a7a60f5345a3f29973b54a493300362adfdd9d50f6693815814bb27606a387918303e343f"

RPROVIDES:${PN} += "texlive-light-latex-make-bin"

RDEPENDS:${PN} += "texlive-light-latex-make"

inherit rpm
