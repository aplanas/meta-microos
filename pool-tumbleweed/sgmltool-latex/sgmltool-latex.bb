SUMMARY = "SGML-Tools - LaTeX generator"
DESCRIPTION = "This package contains the LaTeX generator (sgml2latex) from sgmltool."
LICENSE = "SUSE-Public-Domain"

PV = "1.0.9"

RPM_NAME = "sgmltool-latex-1.0.9-1077.23.aarch64.rpm"
RPM_HASH = "883d9ae58d2c297a26eab1ef614eb0a3523354621db9af38e6106030071c4f33d42ec2941bdf1a17e8c2cbf984ef1e8a60d99075eaa6bb5a9d347788ce4711f6"

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
