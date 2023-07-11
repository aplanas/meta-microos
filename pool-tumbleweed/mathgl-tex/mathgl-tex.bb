SUMMARY = "MathGL scripts for LaTeX documents"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package allows to use MathGL scripts in LaTeX documents."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-tex-8.0.1-4.2.noarch.rpm"
RPM_HASH = "d65ad030c4c04e9ca517d7d5e564406ee4e782edcdc6f891264920ffb845571d6eda8d39f77a9f31a002f0e2254c6603287f1d3428670a32d2f313db07c054f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathgl-tex \
tex-mgltex.sty"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
mathgl-tools \
texlive"

inherit rpm
