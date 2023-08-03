SUMMARY = "Alignment of plain text"
DESCRIPTION = "The package provides horizontal alignment, as in the LaTeX \
command \\listfiles (or the author's longnamefilelist package). \
Uses may include in-text tables, or even code listings."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn28140"

RPM_NAME = "texlive-monofill-2023.209.0.0.2svn28140-55.1.noarch.rpm"
RPM_HASH = "eef15cec7840f37f2f32e126ee508f91b2de6b0964b01e1413c44e02a200eb2df05e125d532b68a75c4e02f45e1af1946c4b2818dfddf9d4e182dd9bd534da93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-monofill.sty \
texlive-monofill"

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
