SUMMARY = "Binary files of latexdiff"
DESCRIPTION = "Binary files of latexdiff"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn16420"

RPM_NAME = "texlive-latexdiff-bin-2023.20230311.svn16420-92.1.aarch64.rpm"
RPM_HASH = "90ea241cab39c5b2bfc4aa621dde457d56f67fbe779865600f90e10a6938020301e972f28864833a8ca56f96317fc44f3989e1681e46023f218bde027ac70335"

RPROVIDES:${PN} += "texlive-latexdiff-bin"

RDEPENDS:${PN} += "texlive-latexdiff"

inherit rpm
