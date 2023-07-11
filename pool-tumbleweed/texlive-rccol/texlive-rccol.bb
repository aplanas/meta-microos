SUMMARY = "Decimal-centered optionally rounded numbers in tabular"
DESCRIPTION = "The rccol package provides decimal-centered numbers: \
corresponding digits and decimal separators aligned. \
Furthermore, rounding to the desired precision is possible. The \
package makes use of the fltpoint package (as well as the LaTeX \
required array package)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2csvn15878"

RPM_NAME = "texlive-rccol-2023.201.1.2csvn15878-53.2.noarch.rpm"
RPM_HASH = "ba0e88186812157fc59aa985b091b4cdd1cbe8fef176e396bea3908c48f870c4b032789d859e474eb04e3da37e415ba94d695e78e82fda3c43a96bb8673eb980"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rccol.sty \
texlive-rccol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-fltpoint.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
