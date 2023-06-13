SUMMARY = "Derivation trees with MetaPost"
DESCRIPTION = "A set of MetaPost macros for typesetting derivation trees (such \
as used in sequent calculus, type inference, programming \
language semantics...). No MetaPost knowledge is needed to use \
these macros."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.97svn29349"

RPM_NAME = "texlive-drv-2023.201.0.0.97svn29349-52.1.noarch.rpm"
RPM_HASH = "15b8bbf208497feef68898a3de9b82c075412d1970006a286d257db7699a803d50db1080877e24d7603ca7ffafa3adaa271593d41ba2fd00c7083ed608653c53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-drv"

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
