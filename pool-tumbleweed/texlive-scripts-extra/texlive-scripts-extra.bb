SUMMARY = "TeX Live scripts"
DESCRIPTION = "Miscellaneous scripts maintained as part of TeX Live, but not \
important for the infrastructure. Thus, this is not part of \
scheme-infraonly or tlcritical, just a normal package."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn62517"

RPM_NAME = "texlive-scripts-extra-2023.209.svn62517-55.1.noarch.rpm"
RPM_HASH = "1c4d233660a2ead77968c75a3378a3c90ca62b293621fac24c63abbbb0e2a3289c2b1b881d0e6c4def1f54880223c62ab07c0f23d39bc7a7166f2149fa6ec4fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tcfmgr.map \
texlive-scripts-extra \
texlive-texconfig-/usr/share/texmf/texconfig/README \
texlive-texconfig-/usr/share/texmf/texconfig/tcfmgr \
texlive-texconfig-/usr/share/texmf/texconfig/tcfmgr.map"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
terminfo-base \
tex-psfrag.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-scripts-extra-bin"

inherit rpm
