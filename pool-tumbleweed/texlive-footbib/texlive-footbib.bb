SUMMARY = "Bibliographic references as footnotes"
DESCRIPTION = "The package makes bibliographic references appear as footnotes. \
It defines a command \\footcite which is similar to the LaTeX \
\\cite command but the references cited in this way appear at \
the bottom of the pages. This 'foot bibliography' does not \
conflict with the standard one and both may exist \
simultaneously in a document. The command \\cite may still be \
used to produce the standard bibliography. The foot \
bibliography uses its own style and bibliographic database \
which may be specified independently of the standard one. Any \
standard bibliography style may be used."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.7svn17115"

RPM_NAME = "texlive-footbib-2023.201.2.0.7svn17115-52.1.noarch.rpm"
RPM_HASH = "0f8944dcf8c6b7211a9612d81ab2df5d0cf04b2885c9deca5181c1b63953ca6fd00b0b5978eb7d98266fbbe20a21efe2b40f06ca577ac321c520b909536317b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-footbib.sty \
texlive-footbib"

RDEPENDS:${PN} += "/bin/sh \
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
