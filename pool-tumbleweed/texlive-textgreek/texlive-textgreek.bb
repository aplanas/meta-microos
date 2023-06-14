SUMMARY = "Upright greek letters in text"
DESCRIPTION = "Use upright greek letters as text symbols, e.g. \\textbeta."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn44192"

RPM_NAME = "texlive-textgreek-2023.201.0.0.7svn44192-54.1.noarch.rpm"
RPM_HASH = "727efeaa3cfa1b03d1fcf3313c4cc594ad93c51d0cd02d934503651971d16fce4efc3cc9cfef6bd343c6da95c0b584fb5e512f7330a0208b1f396074cd4cf3e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-textgreek.sty \
texlive-textgreek"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-greek-fontenc \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
