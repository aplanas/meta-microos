SUMMARY = "Build tools to process tokens from an input stream"
DESCRIPTION = "The tokcycle package helps one to build tools to process tokens \
from an input stream. If a macro to process an arbitrary single \
token can be built, then tokcycle can provide a wrapper for \
cycling through an input stream (including macros, spaces, and \
groups) on a token-by-token basis, using the provided macro on \
each successive character. tokcycle characterizes each \
successive token in the input stream as a Character, a Group, a \
Macro, or a Space. Each of these token categories are processed \
with a unique directive, to bring about the desired effect of \
the token cycle. If condition flags are provided to identify \
active, implicit, and catcode-6 tokens as they are digested. \
The package provides a number of options for handling groups."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.42svn60320"

RPM_NAME = "texlive-tokcycle-2023.209.1.42svn60320-53.1.noarch.rpm"
RPM_HASH = "3fbf8c86f4db76d0b8ca5d5498205680cbccc00ec68a2599d037e3d71051e5597406b796d62595b15e4a27c9668b20189bbffc4f82799d5d9ddcb8fce0a66ccb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tokcycle.sty \
tex-tokcycle.tex \
texlive-tokcycle"

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
