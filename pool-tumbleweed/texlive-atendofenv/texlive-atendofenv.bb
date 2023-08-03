SUMMARY = "Add a custom symbol at the end of an environment"
DESCRIPTION = "This package allows adding a custom symbol at the end of an \
environment (e.g. theorems, definitions, remarks)."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.2svn62164"

RPM_NAME = "texlive-atendofenv-2023.209.0.0.2svn62164-54.1.noarch.rpm"
RPM_HASH = "e192a47ed003618b2733a4b73b55669e945067a4e8e6a7cc6bd73785320a1cedd46480ea2e94f64f453479236dabf398008bacb0311998372d47d5bf8ea028eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-atendofenv.sty \
texlive-atendofenv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsthm.sty \
tex-letltxmacro.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
