SUMMARY = "Decimal-centered optionally rounded numbers in tabular"
DESCRIPTION = "The rccol package provides decimal-centered numbers: \
corresponding digits and decimal separators aligned. \
Furthermore, rounding to the desired precision is possible. The \
package makes use of the fltpoint package (as well as the LaTeX \
required array package)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2csvn15878"

RPM_NAME = "texlive-rccol-2023.209.1.2csvn15878-54.2.noarch.rpm"
RPM_HASH = "512e25ed4d9cbd1077d79818ce99876096101d28da3664f21edbdcbe9f8c0fbab5d0ea894cbcd1e953d563f17b1a0eec4e00a7f67a57b2285a1f49277bc8b0f4"
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
