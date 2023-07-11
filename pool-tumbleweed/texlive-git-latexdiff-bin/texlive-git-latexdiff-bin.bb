SUMMARY = "Binary files of git-latexdiff"
DESCRIPTION = "Binary files of git-latexdiff"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn54732"

RPM_NAME = "texlive-git-latexdiff-bin-2023.20230311.svn54732-92.1.aarch64.rpm"
RPM_HASH = "8537cc0c866e2763e801e4abd834d3cd58fee326faadbd18b4f8e728b5c29c1854587d47f8c99d68d0c5e937646f9c5b909df7730ac4ce77ffb7ca75596234ab"

RPROVIDES:${PN} += "texlive-git-latexdiff-bin"

RDEPENDS:${PN} += "texlive-git-latexdiff"

inherit rpm
