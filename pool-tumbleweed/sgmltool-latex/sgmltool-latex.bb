SUMMARY = "SGML-Tools - LaTeX generator"
DESCRIPTION = "This package contains the LaTeX generator (sgml2latex) from sgmltool."
LICENSE = "SUSE-Public-Domain"

PV = "1.0.9"

RPM_NAME = "sgmltool-latex-1.0.9-1077.22.aarch64.rpm"
RPM_HASH = "c2637a4b1c4678168eb098e935f6cfb780fb25db1e8acff64625202940d04a0c46e30fa81df3ee07a88ac54125748e1c9a09353684ca468b4ae1a84c47df8fd1"

RPROVIDES:${PN} += "sgmltool-latex \
sgmltool-latex(aarch-64) \
sgmltool:/usr/bin/sgml2latex"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
sgmltool \
texlive-epsf \
texlive-filesystem \
texlive-kpathsea \
texlive-latex \
texlive-url"

inherit rpm
