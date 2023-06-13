SUMMARY = "Easy drawing of syntactic proofs"
DESCRIPTION = "The package provides a set of macros based on PSTricks that \
will enable you to draw syntactic proofs easily (inspired by \
the Gamut books). Very few commands are needed, however fine \
tuning of the various parameters (dimensions) can still be \
achieved through 'key=value' pairs."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-synproof-2023.201.1.0svn15878-57.1.noarch.rpm"
RPM_HASH = "fbd5a042b3a780477df1213d4123861d63315a28dd020be48326c2239a5e402a58fe500aef595f49e25a9cf5ae0f4b588fe6355638d3909a550071dc55b564ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(synproof.sty) \
texlive-synproof"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
tex(keyval.sty) \
tex(pst-node.sty) \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
