SUMMARY = "Take action at every \\shipout"
DESCRIPTION = "This package provides hooks into \\sshipout called \\EveryShipout \
and \\AtNextShipout analogous to \\AtBeginDocument. With the \
introduction of the LaTeX hook management this package became \
obsolete in 2020 and is only provided for backwards \
compatibility. For current versions of LaTeX it is only mapping \
the hooks to the original everyshi macros. In case you use an \
older LaTeX format, everyshi will automatically fall back to \
its old implementation by loading everyshi-2001-05-15."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.00svn57001"

RPM_NAME = "texlive-everyshi-2023.201.4.00svn57001-52.1.noarch.rpm"
RPM_HASH = "0d229cdbcb69321efde56dd8e89a8c85f69e9b7e60cc384f95131704e4a6ad6c07711d3e5700ad2fbe61ea37d7733cba5875e8d6aac9800bf045bfd358bca6f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-everyshi-2001-05-15.sty \
tex-everyshi.sty \
texlive-everyshi"

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
