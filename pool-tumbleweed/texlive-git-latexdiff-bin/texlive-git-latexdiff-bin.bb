SUMMARY = "Binary files of git-latexdiff"
DESCRIPTION = "Binary files of git-latexdiff"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn54732"

RPM_NAME = "texlive-git-latexdiff-bin-2023.20230311.svn54732-91.1.aarch64.rpm"
RPM_HASH = "5b7d2e0a401328dc190d9a268bb96441a403dd1adafce0497decab3a33a1cdec809bf164a15d7d0bbd2e966f52d6b8f974aaeadcc9d00708ca14d18d35a37f30"

RPROVIDES:${PN} += "texlive-git-latexdiff-bin"

RDEPENDS:${PN} += "texlive-git-latexdiff"

inherit rpm
