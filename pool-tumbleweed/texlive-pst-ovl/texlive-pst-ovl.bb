SUMMARY = "Create and manage graphical overlays"
DESCRIPTION = "The package is useful when building an image from assorted \
material, as in the slides of a projected presentation. The \
package requires pstricks, and shares that package's \
restrictions on usage when generating PDF output."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.07bsvn54963"

RPM_NAME = "texlive-pst-ovl-2023.209.0.0.07bsvn54963-53.1.noarch.rpm"
RPM_HASH = "b0071a1bb128f0db77e86cb99dd12eac7aee2309929f33d1755f4d22750579812db0bc710b7bd59e7234b12756172985ff4934317542dcf0b3447b3740a32ca0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-ovl.sty \
tex-pst-ovl.tex \
texlive-pst-ovl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
