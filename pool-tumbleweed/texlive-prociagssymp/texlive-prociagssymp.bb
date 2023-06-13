SUMMARY = "Macros for IAG symposium papers"
DESCRIPTION = "This package provides (re-)definitions of some LaTeX commands \
that can be useful for the preparation of papers with the style \
of the proceedings of symposia sponsored by the 'International \
Association of Geodesy (IAG)' published by Springer-Verlag."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63242"

RPM_NAME = "texlive-prociagssymp-2023.201.svn63242-52.1.noarch.rpm"
RPM_HASH = "8ff909da70041a9847abee0c07024002aaacdafe663ec804e633dbc19b369ec135d6a225c049d78ad771473033a07399077918f6c1283cfd02dee552ac6808e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(procIAGssymp.sty) \
texlive-prociagssymp"

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
