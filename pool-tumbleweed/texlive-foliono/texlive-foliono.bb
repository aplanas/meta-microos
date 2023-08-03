SUMMARY = "Use folio numbers to replace page numbers"
DESCRIPTION = "This package adds functionality to create several styles of \
folio numbers. Folio numbering preceded the modern page \
numbering convention and was in common use until the 18th \
century. In folio numbering the numbers are placed only on odd \
(right-side) pages and the numbers typically comprise of two \
parts: quire and folio numbers. The intended use for this \
package is to help creating old-style books."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.000svn58877"

RPM_NAME = "texlive-foliono-2023.209.1.000svn58877-53.1.noarch.rpm"
RPM_HASH = "58db2c90e8be759be69dd8ad6fbfc4f379ae4cfca7494cda8597180447fa55d5cb01e599a7c3db7103bbc0452e9f1de5fcb28186a23bb1a2462c3548a04955e9"
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
