SUMMARY = "Convert Japanese TeX documents to PDF"
DESCRIPTION = "The Lua script provides system-independent support of Japanese \
typesetting engines in TeXworks. As TeXworks typesetting setup \
does not allow for multistep processing, this script runs one \
of the ptex-based programs (ptex, uptex, eptex, platex, \
uplatex) followed by dvipdfmx."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.20200520.0svn65953"

RPM_NAME = "texlive-ptex2pdf-2023.209.20200520.0svn65953-54.2.noarch.rpm"
RPM_HASH = "dfd96cab7b8c6db1eb282246a702e5d238991f38683f7ac6109f802636e1beffcd5bbd56de3b3d48359aa48f6e659904c70f49e983c1f6505afe80db9d397402"
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
