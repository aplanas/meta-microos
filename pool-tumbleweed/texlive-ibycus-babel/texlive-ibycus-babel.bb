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

PV = "2023.201.3.0svn15878"

RPM_NAME = "texlive-ibycus-babel-2023.201.3.0svn15878-52.1.noarch.rpm"
RPM_HASH = "4ab01927458aa69faa84497499ffe80aa0e8adb23d1f0e55d9b2351f2a6df38adf624a7be43ce9f2741f9170bc63863bcc2fcf7e947b45cda9f0f4680c42dadc"
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
