SUMMARY = "Use the Ibycus 4 Greek font with Babel"
DESCRIPTION = "The package allows you to use the Ibycus 4 font for ancient \
Greek with Babel. It uses a Perl script to generate hyphenation \
patterns for Ibycus from those for the ordinary Babel encoding, \
cbgreek. It sets up ibycus as a pseudo-language you can specify \
in the normal Babel manner. For proper hyphenation of Greek \
quoted in mid-paragraph, you should use it with elatex (all \
current distributions of LaTeX are built with e-TeX, so the \
constraint should not be onerous)."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn15878"

RPM_NAME = "texlive-ibycus-babel-2023.209.3.0svn15878-54.1.noarch.rpm"
RPM_HASH = "38ed6b4f450a1b8a708689c248846a14bcb5da68e32826ff8d6ef7bf1df710d2bd4c610047bb12a53a1b3c1448e49ae31f8bab1678fe42cf09c0d9fc91188050"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ibycus.ldf \
tex-lgienc.def \
tex-lgifib.fd \
texlive-ibycus-babel"

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
