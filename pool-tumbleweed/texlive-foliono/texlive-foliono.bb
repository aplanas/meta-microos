SUMMARY = "Use folio numbers to replace page numbers"
DESCRIPTION = "This package adds functionality to create several styles of \
folio numbers. Folio numbering preceded the modern page \
numbering convention and was in common use until the 18th \
century. In folio numbering the numbers are placed only on odd \
(right-side) pages and the numbers typically comprise of two \
parts: quire and folio numbers. The intended use for this \
package is to help creating old-style books."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.000svn58877"

RPM_NAME = "texlive-foliono-2023.201.1.000svn58877-52.1.noarch.rpm"
RPM_HASH = "75ad137c48a273e943c6043e2355e2e1954af8a60bd49026aff92d61f721a6a3f168bdf0f8687fc9aacd60dcd86a98361a4fb0fde8a5230343f249ee8d228017"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-foliono.sty \
texlive-foliono"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
