SUMMARY = "A tutorial aimed at introducing undergraduate students to LaTeX"
DESCRIPTION = "A tutorial aimed at introducing undergraduate students to \
LaTeX, including an introduction to LaTeX Workshop in Visual \
Studio Code and an example package of user-defined LaTeX \
commands."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0.2svn64647"

RPM_NAME = "texlive-latex-for-undergraduates-2023.201.1.0.2svn64647-55.1.noarch.rpm"
RPM_HASH = "62f46db31005eb3d2af6c0e023b9357a6c3fadc72c90ac3db8326db71e08bcb93751f445e3e4487cc3e8226c7dc9d0957720df433e4dd76e6eca799237424da8"
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
