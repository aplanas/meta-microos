SUMMARY = "Binary files of git-latexdiff"
DESCRIPTION = "Binary files of git-latexdiff"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn54732"

RPM_NAME = "texlive-git-latexdiff-bin-2023.20230311.svn54732-93.1.aarch64.rpm"
RPM_HASH = "3d91d050097cbb8e051789b8af55195bc2426a47dc473985f58707aaef6aa10765e952ee39391655bf0411850dc2736afc1d1a1e492a95d80501ca3299cc7e44"

RPROVIDES:${PN} += "texlive-git-latexdiff-bin"

RDEPENDS:${PN} += "texlive-git-latexdiff"

inherit rpm
