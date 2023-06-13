SUMMARY = "Typeset laboratory journals"
DESCRIPTION = "This class is designed to typeset laboratory journals that \
contain chronologically ordered records about experiments. From \
the sectioning commands, an experiment index is generated. The \
class is based on the KOMA-Script class scrbook.cls. There can \
be several index entries for one experiment."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-labbook-2023.201.svn15878-55.1.noarch.rpm"
RPM_HASH = "093533d5964519d017cbd38b4151af7ac96897a3d1f456296463bee79045f6e73eacb2d78049ff7297305158cf5f774dfa12e725bce1dc2fd5b6c279a4e95540"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(labbook.cls) \
texlive-labbook"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(makeidx.sty) \
tex(scrbook.cls) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
