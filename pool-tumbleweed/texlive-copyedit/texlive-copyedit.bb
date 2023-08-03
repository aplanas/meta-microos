SUMMARY = "Copyediting support for LaTeX documents"
DESCRIPTION = "This package implements copyediting support for LaTeX \
documents. Authors can enjoy the freedom of using, for example, \
words with US or UK or Canadian or Australian spelling in a \
mixed way, yet, they can choose any one of the usage forms for \
their entire document irrespective of kinds of spelling they \
have adopted. In the same fashion, the users can have the \
benefit of the following features available in the package: \
Localization -- British-American-Australian-Canadian Close-up, \
Hyphenation, and Spaced words Latin abbreviations Acronyms and \
Abbreviations Itemization, nonlocal lists and labels \
Parenthetical and serial commas Non-local tokenization in \
language through Abbreviations and pronouns."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn37928"

RPM_NAME = "texlive-copyedit-2023.209.1.6svn37928-55.1.noarch.rpm"
RPM_HASH = "a654e0d853c2cfc6f6b34d9e2632ad0003b6e5ecc184f5fb562bd1e639ee1a2f078e224044c6ff2e45e7dbb183272161c0d29245e2f22d54a848ec2950410066"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-copyedit.sty \
texlive-copyedit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-acronym.sty \
tex-enumitem.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
