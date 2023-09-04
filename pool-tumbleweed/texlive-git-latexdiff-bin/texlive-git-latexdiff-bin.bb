SUMMARY = "Binary files of git-latexdiff"
DESCRIPTION = "Binary files of git-latexdiff"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn54732"

RPM_NAME = "texlive-git-latexdiff-bin-2023.20230311.svn54732-93.2.aarch64.rpm"
RPM_HASH = "6171e91da7eeb3a20ea248ebe0d79bbdc8243c22682037d2b06f4ab0776a153119fa149246f302b0b78c266e5f41b37bb12324f405812a16ae4b0d140a0b4c1a"

RPROVIDES:${PN} += "texlive-git-latexdiff-bin"

RDEPENDS:${PN} += "texlive-git-latexdiff"

inherit rpm
