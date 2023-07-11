SUMMARY = "Randomise token strings"
DESCRIPTION = "The package provides means of randomising lists of tokens, or \
lists of chunks of tokens. Two mechanisms for defining chunks \
are provided: the \\ranToks command accepts an argument \
containing tokens to be randomised; and the \\bRTVToks/\\eRTVToks \
commands delimit a collection of tokens for randomising; each \
group inside a rtVw constitutes one of these (typically larger) \
token sets."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59515"

RPM_NAME = "texlive-ran_toks-2023.201.svn59515-53.2.noarch.rpm"
RPM_HASH = "959b1fed781ef2cc6f9b2edd571d57a6cceb3bb81bc4a192b072c4ada3459b79e91a3b9583687746ba9f24638a27425b27ecffceeed3a0b3bf43ee9ab2b29f03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ran-toks.sty \
tex-rt-dbapp.def \
texlive-ran-toks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
