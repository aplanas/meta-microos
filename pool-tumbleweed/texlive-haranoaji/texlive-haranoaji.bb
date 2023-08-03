SUMMARY = "Harano Aji Fonts"
DESCRIPTION = "Harano Aji Fonts (Harano Aji Mincho and Harano Aji Gothic) are \
fonts obtained by replacing Adobe-Identity-0 (AI0) CIDs of \
Source Han fonts (Source Han Serif and Source Han Sans) with \
Adobe-Japan1 (AJ1) CIDs. There are 14 fonts, 7 weights each for \
Mincho and Gothic."
LICENSE = "OFL-1.1"

PV = "2023.209.20230223svn66115"

RPM_NAME = "texlive-haranoaji-2023.209.20230223svn66115-54.1.noarch.rpm"
RPM_HASH = "66b64f4eeb24d4580d4b98096444b9a2686ce94a2d2df7513153d7d457e212e6c476cb2f955d09fe0ece8f670b26de11b581045100e0488733df78383519f3e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-haranoaji"

RDEPENDS:${PN} += "/usr/bin/sh \
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
texlive-haranoaji-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texlive.infra"

inherit rpm
