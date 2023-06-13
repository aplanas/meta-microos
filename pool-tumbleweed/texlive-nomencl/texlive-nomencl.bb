SUMMARY = "Produce lists of symbols as in nomenclature"
DESCRIPTION = "Produces lists of symbols using the capabilities of the \
MakeIndex program."
LICENSE = "LPPL-1.0"

PV = "2023.201.5.6svn61029"

RPM_NAME = "texlive-nomencl-2023.201.5.6svn61029-54.1.noarch.rpm"
RPM_HASH = "37d5705b7b36a4e49b1e9abc47b02f7fab52743a7d6b0b7fbc94a027e06b5fa51bb4eb709fc57f2d6e1ff566314f5a2cbfbdbfbef36fd63e9e4eea00db3893c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nomencl.sty) \
texlive-nomencl"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
tex(ifthen.sty) \
tex(longtable.sty) \
tex(siunitx.sty) \
tex(tocbasic.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
