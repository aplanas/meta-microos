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

RPM_NAME = "texlive-ran_toks-2023.209.svn59515-54.2.noarch.rpm"
RPM_HASH = "7f09c344cb7739b568fff264edcd47280b84ccdea7c8292fe516c9f440c25579d8c9a67cc64cd843f987963ac2bd9b5a81f2da6ad3d6b8e8223ae9b812099de7"
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
