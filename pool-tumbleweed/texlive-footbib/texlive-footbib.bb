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

PV = "2023.209.2.0.7svn17115"

RPM_NAME = "texlive-footbib-2023.209.2.0.7svn17115-53.1.noarch.rpm"
RPM_HASH = "bf753d6cd4b97ee2f9732b22c0313400eec47832a7a28de1b59cd4238a0609ce7d6fc1e980911cbb69c8f9b8797465f720db063201ee1875231070ed38e5d858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-footbib.sty \
texlive-footbib"

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
