SUMMARY = "A tutorial aimed at introducing undergraduate students to LaTeX"
DESCRIPTION = "A tutorial aimed at introducing undergraduate students to \
LaTeX, including an introduction to LaTeX Workshop in Visual \
Studio Code and an example package of user-defined LaTeX \
commands."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0.2svn64647"

RPM_NAME = "texlive-latex-for-undergraduates-2023.209.1.0.2svn64647-56.1.noarch.rpm"
RPM_HASH = "ddacea2e6b33a5bc890542869056f9320e934e3081f77db21f04d0fc0555f70bfb02ee8896e57c84ee000ad40b9edb9be86febad4eaa4a18a3bd4fdbc02d147c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-for-undergraduates"

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
