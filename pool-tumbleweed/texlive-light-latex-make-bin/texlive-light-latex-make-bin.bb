SUMMARY = "Binary files of light-latex-make"
DESCRIPTION = "Binary files of light-latex-make"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn56352"

RPM_NAME = "texlive-light-latex-make-bin-2023.20230311.svn56352-92.1.aarch64.rpm"
RPM_HASH = "4a51916a0ab61f6250cd529729c2b708a251cc98aa975f8e8234e2a35acb0b8f02a2657d0e248f6c255473b035bc934a8af389dc6d9f0de1b0a1e039ca4b59bf"

RPROVIDES:${PN} += "texlive-light-latex-make-bin"

RDEPENDS:${PN} += "texlive-light-latex-make"

inherit rpm
