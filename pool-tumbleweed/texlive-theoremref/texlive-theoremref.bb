SUMMARY = "References with automatic theorem names"
DESCRIPTION = "The theoremref package provides variants of the \\label and \\ref \
commands for theorem-like environments, capable of \
automatically typesetting references including the theorem name \
(apart from the theorem number). The scheme is particularly \
valuable if the author decides to change a lemma to a \
proposition or a theorem (or whatever)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54512"

RPM_NAME = "texlive-theoremref-2023.201.svn54512-54.1.noarch.rpm"
RPM_HASH = "ebdf282aa5234ae4f334f4aff67d21edc21872c67971f1b04d1d185f10e9e4f9297fac40c4fde96f8cd44b8c1165bc6fc84b42b91d88f2cc2412aa5c786fb180"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(theoremref.sty) \
texlive-theoremref"
RDEPENDS:${PN} += "/bin/sh \
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
