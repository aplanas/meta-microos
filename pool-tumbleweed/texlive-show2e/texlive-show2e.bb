SUMMARY = "Variants of \\show for LaTeX2e"
DESCRIPTION = "This small package aims at making debugging (especially in an \
interactive way) easier, by providing \\show variants suited to \
LaTeX2e commands (whether with optional arguments or robust) \
and environments. The variant commands also display the \
internal macros used by such commands, if any. The \\showcs \
variant helps with macros with exotic names."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-show2e-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "77f1bf8f01b7d6e43fbf514071af27f64421802df95c004806a389ddcc596c86e200705274367fbd751f6f947d82621d3a57d161c0de29eed6d654cd6762c664"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-show2e.sty \
texlive-show2e"

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
