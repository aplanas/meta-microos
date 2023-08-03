SUMMARY = "Decimal-centered optionally rounded numbers in tabular"
DESCRIPTION = "The rccol package provides decimal-centered numbers: \
corresponding digits and decimal separators aligned. \
Furthermore, rounding to the desired precision is possible. The \
package makes use of the fltpoint package (as well as the LaTeX \
required array package)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2csvn15878"

RPM_NAME = "texlive-rccol-2023.209.1.2csvn15878-54.1.noarch.rpm"
RPM_HASH = "a2f0996568045314b4c1fcb5da6c4c3e56a7fbcfd7425aca5b3776f2a94ab042b15f8e36b34bf6a9d2086df584b4ebe2273e78b6b88a353c809c1163a970df21"
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
