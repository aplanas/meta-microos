SUMMARY = "Find mismatches of parentheses, braces, (angle) brackets, in texts"
DESCRIPTION = "Mismatches of parentheses, braces, (angle) brackets, especially \
in TeX sources which may be rich in those, may be difficult to \
trace. This little Ruby script helps you by writing your text \
to standard output, after adding a left margin to your text, \
which will normally be almost empty, but will clearly show any \
mismatches."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.1.43svn36270"

RPM_NAME = "texlive-match_parens-2023.208.1.43svn36270-53.1.noarch.rpm"
RPM_HASH = "3a23b540730fc135c4c9625e2fac783e230ed959748a5d00051943cdaa82d29d11c39267d56e6da22c2ab032ccd22ff0fca630b057923d0a569d7f6471c60de6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-match-parens"

RDEPENDS:${PN} += "/usr/bin/ruby \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-match-parens-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
