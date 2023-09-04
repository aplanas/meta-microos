SUMMARY = "SGML-Tools - LaTeX generator"
DESCRIPTION = "This package contains the LaTeX generator (sgml2latex) from sgmltool."
LICENSE = "SUSE-Public-Domain"

PV = "1.0.9"

RPM_NAME = "sgmltool-latex-1.0.9-1077.24.aarch64.rpm"
RPM_HASH = "beecfa2a782fe3621ab0151e884ea2f8c3e75b74f158041e8e264a40886a269dca3d7dc8ed8f90e30c1aac0fdc17d5d72c8b1d62273899c4449875d922d0852c"

RPROVIDES:${PN} += "sgmltool-/usr/bin/sgml2latex \
sgmltool-latex"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
sgmltool \
texlive-epsf \
texlive-filesystem \
texlive-kpathsea \
texlive-latex \
texlive-url"

inherit rpm
