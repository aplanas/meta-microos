SUMMARY = "A font for the pigpen (or masonic) cipher"
DESCRIPTION = "The Pigpen cipher package provides the font and the necessary \
wrappers (style file, etc.) in order to write Pigpen ciphers, a \
simple substitution cipher. The package provides a font \
(available both as Metafont source, and as an Adobe Type 1 \
file), and macros for its use."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-pigpen-2023.209.0.0.2svn15878-52.1.noarch.rpm"
RPM_HASH = "4bc77ba20810d898abed82c96e329b0ec2652ab5ff352c110ec9f1af8fb856b1f1fb8d8ef37bd1af3a03ea1464667e94323b5e6e760391ec1669656c24333651"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pigpen.map \
tex-pigpen.sty \
tex-pigpen.tex \
tex-pigpen.tfm \
texlive-pigpen"

RDEPENDS:${PN} += "/usr/bin/sh \
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
