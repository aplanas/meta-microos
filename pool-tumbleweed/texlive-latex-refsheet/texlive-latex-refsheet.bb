SUMMARY = "LaTeX Reference Sheet for a thesis with KOMA-Script"
DESCRIPTION = "This LaTeX Reference Sheet is for writing a thesis using the \
KOMA-Script document classes (scrartcl, scrreprt, scrbook) and \
all the packages needed for a thesis in natural sciences."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn45076"

RPM_NAME = "texlive-latex-refsheet-2023.209.1.2svn45076-56.1.noarch.rpm"
RPM_HASH = "f65d51384c508bbeedcf0abfdae6a3ef7c042c52d4efebbe3850007eca9b088598f17601e907a0f27d516ad0fec89287b7ad86338d7d5f43d1302be91f3ebdfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-refsheet"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
