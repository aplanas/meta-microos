SUMMARY = "A font for the pigpen (or masonic) cipher"
DESCRIPTION = "The Pigpen cipher package provides the font and the necessary \
wrappers (style file, etc.) in order to write Pigpen ciphers, a \
simple substitution cipher. The package provides a font \
(available both as Metafont source, and as an Adobe Type 1 \
file), and macros for its use."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-pigpen-2023.201.0.0.2svn15878-51.1.noarch.rpm"
RPM_HASH = "62fbbf8da672c8bca0806fb3bde58ce5b8ec04e1623e689321c7e685f19589515702109d0a021748bed712c2008a6df479246e88eda6b48848ee6ccb7f5b160e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pigpen.map \
tex-pigpen.sty \
tex-pigpen.tex \
tex-pigpen.tfm \
texlive-pigpen"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pigpen-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
