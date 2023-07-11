SUMMARY = "LaTeX to HTML Converter"
DESCRIPTION = "LaTeX2HTML lets you convert basic LaTeX documents into the HTML \
format. This allows both a written and online version even of older \
LaTeX texts."
LICENSE = "GPL-2.0-or-later"

PV = "2023"

RPM_NAME = "latex2html-2023-1.3.noarch.rpm"
RPM_HASH = "c8c09f4e880baf2c6a33985540a6992de688288c0bfe8b87bfe167b8ecf07d4cf0004d40991936813664b4317ad9bd205a91c39e7c819655441592dd657b7476"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "latex2html \
perl-L2hos \
perl-L2hos--Dos \
perl-L2hos--Mac \
perl-L2hos--OS2 \
perl-L2hos--Unix \
perl-L2hos--Win32 \
perl-cfgcache"

RDEPENDS:${PN} += "/usr/bin/perl \
ghostscript-any \
latex2html-pngicons \
netpbm \
perl \
texlive-dvips \
texlive-latex \
texlive-preview"

inherit rpm
