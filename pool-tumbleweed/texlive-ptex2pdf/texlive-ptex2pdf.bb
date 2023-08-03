SUMMARY = "Convert Japanese TeX documents to PDF"
DESCRIPTION = "The Lua script provides system-independent support of Japanese \
typesetting engines in TeXworks. As TeXworks typesetting setup \
does not allow for multistep processing, this script runs one \
of the ptex-based programs (ptex, uptex, eptex, platex, \
uplatex) followed by dvipdfmx."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.20200520.0svn65953"

RPM_NAME = "texlive-ptex2pdf-2023.209.20200520.0svn65953-54.1.noarch.rpm"
RPM_HASH = "bdf8861de634f7be7f361962b066cc90f0b1436b3def4fca88a7e3d70b25ab79dab6a4967964d4001131cd9996fcfe77116bb2d7109320d27a91a484b1345a13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex2pdf"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
perl \
perl-TeXLive--TLUtils \
sed \
tex-texmf.cnf \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-ptex2pdf-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texlive.infra"

inherit rpm
