SUMMARY = "References with automatic theorem names"
DESCRIPTION = "The theoremref package provides variants of the \\label and \\ref \
commands for theorem-like environments, capable of \
automatically typesetting references including the theorem name \
(apart from the theorem number). The scheme is particularly \
valuable if the author decides to change a lemma to a \
proposition or a theorem (or whatever)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54512"

RPM_NAME = "texlive-theoremref-2023.209.svn54512-55.1.noarch.rpm"
RPM_HASH = "dd0e6d7355c842e6cc6a3574e75217be63d62f8e4a1aee6d7d1ebb48408575417f5d9f125a69c9438d37be8edb26d6226f93db0541d900ba53c4264e33567ab3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-theoremref.sty \
texlive-theoremref"

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
