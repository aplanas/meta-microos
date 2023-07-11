SUMMARY = "Convert Japanese TeX documents to PDF"
DESCRIPTION = "The Lua script provides system-independent support of Japanese \
typesetting engines in TeXworks. As TeXworks typesetting setup \
does not allow for multistep processing, this script runs one \
of the ptex-based programs (ptex, uptex, eptex, platex, \
uplatex) followed by dvipdfmx."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.20200520.0svn65953"

RPM_NAME = "texlive-ptex2pdf-2023.201.20200520.0svn65953-53.2.noarch.rpm"
RPM_HASH = "323ea5b7a4e1f4e77ab5249019857a48eedfdd4b218093a4416a2243031ff37a12353dd11aa5a49ddef1a74df32d0fc7dde13a5776c5e2cd66d6f15c08760587"
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
