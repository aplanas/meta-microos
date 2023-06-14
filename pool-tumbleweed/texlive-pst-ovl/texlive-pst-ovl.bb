SUMMARY = "Create and manage graphical overlays"
DESCRIPTION = "The package is useful when building an image from assorted \
material, as in the slides of a projected presentation. The \
package requires pstricks, and shares that package's \
restrictions on usage when generating PDF output."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.07bsvn54963"

RPM_NAME = "texlive-pst-ovl-2023.201.0.0.07bsvn54963-52.1.noarch.rpm"
RPM_HASH = "bfe7c80e1c82ea8101d8e0f7818d48d4655b4bcb753beee3acd43385b11f15edaf3ebdeb70e5da3e01d20d6067d48288f9f0514b64e7483420002ac35705a23e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-ovl.sty \
tex-pst-ovl.tex \
texlive-pst-ovl"

RDEPENDS:${PN} += "/bin/sh \
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
