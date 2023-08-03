SUMMARY = "Changing fonts, sizes and encodings in Plain TeX"
DESCRIPTION = "The fontch macros allow the user to change font size and family \
anywhere in a plain TeX document. Sizes of 8, 10, 12, 14, 20 \
and 24 points are available. A sans serif family (\\sf) is \
defined in addition to the families already defined in plain \
TeX. Optional support for Latin Modern T1 and TS1 fonts is \
given. There are macros for non-latin1 letters and for most TS1 \
symbols. Math mode always uses CM fonts. A command for \
producing doubled-spaced documents is also provided. The \
present version of the package is designed to deal with the \
latest release of the Latin Modern fonts version 1.106. \
Unfortunately, it can no longer support earlier versions of the \
fonts, so an obsolete version of the package is retained for \
users who don't yet have access to the latest version of the \
fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn17859"

RPM_NAME = "texlive-fontch-2023.209.2.2svn17859-53.1.noarch.rpm"
RPM_HASH = "858d32726f0451ac8c89b11f61defe0fbde1393f583e0a8043616e273cbf9f91da3695f8ae998b85b36168b5798921f3b9a2f1ebfe696944a5663797c6992197"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-DSmac.tex \
tex-TS1mac.tex \
tex-bsymbols.tex \
tex-fontch-doc.tex \
tex-fontch.tex \
texlive-fontch"

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
