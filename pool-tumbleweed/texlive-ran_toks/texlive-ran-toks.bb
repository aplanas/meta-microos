SUMMARY = "Randomise token strings"
DESCRIPTION = "The package provides means of randomising lists of tokens, or \
lists of chunks of tokens. Two mechanisms for defining chunks \
are provided: the \\ranToks command accepts an argument \
containing tokens to be randomised; and the \\bRTVToks/\\eRTVToks \
commands delimit a collection of tokens for randomising; each \
group inside a rtVw constitutes one of these (typically larger) \
token sets."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn59515"

RPM_NAME = "texlive-ran_toks-2023.209.svn59515-54.1.noarch.rpm"
RPM_HASH = "078d7ba82debf98f32102df765cc0cf879c2db83b2008ceb4396d341015ca5cf15c0b206e6a264d071d480ef3099352217869ae671fbd5da3cd8dca5935bb522"
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
