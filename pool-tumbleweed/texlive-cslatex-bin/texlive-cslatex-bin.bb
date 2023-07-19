SUMMARY = "Binary files of cslatex"
DESCRIPTION = "Binary files of cslatex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-cslatex-bin-2023.20230311.svn3006-93.1.aarch64.rpm"
RPM_HASH = "3dad0563611f6b68a4acdf445a1e1ea78edb39c4f8b6f8a9dc25ace0e5345f79b6022c0a267c8de166784a62cc5873158096a27f58ecd720a737554a8a092167"

RPROVIDES:${PN} += "texlive-cslatex-bin"

RDEPENDS:${PN} += "texlive-cslatex"

inherit rpm
