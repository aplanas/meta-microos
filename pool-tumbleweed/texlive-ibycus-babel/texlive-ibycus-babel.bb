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

PV = "2023.208.3.0svn15878"

RPM_NAME = "texlive-ibycus-babel-2023.208.3.0svn15878-53.1.noarch.rpm"
RPM_HASH = "85ad2fcc10c898c033f52e6fb4848c617492ccbf65dbf319d95ba134c4bc3b0306eadf3895adb5d00022a34de3e88a676e40587632d198f2d37b3768503e39d4"
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
