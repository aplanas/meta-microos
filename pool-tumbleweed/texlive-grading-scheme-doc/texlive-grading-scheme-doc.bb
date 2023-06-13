SUMMARY = "Documentation for texlive-grading-scheme"
DESCRIPTION = "This package includes the documentation for texlive-grading-scheme"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.1svn62505"

RPM_NAME = "texlive-grading-scheme-doc-2023.201.0.0.1.1svn62505-53.1.noarch.rpm"
RPM_HASH = "bd7f707de513734cb2d53cf43166f189b8ffe6b0f4227057ad235414cff241fb82f443ca0f79e636da05dea5acd58acd6706f93c716c4f59908a14e319158e0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grading-scheme-doc"

RDEPENDS:${PN} += ""

inherit rpm
