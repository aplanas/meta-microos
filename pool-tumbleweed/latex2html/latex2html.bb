SUMMARY = "LaTeX to HTML Converter"
DESCRIPTION = "LaTeX2HTML lets you convert basic LaTeX documents into the HTML \
format. This allows both a written and online version even of older \
LaTeX texts."
LICENSE = "GPL-2.0-or-later"

PV = "2023.2"

RPM_NAME = "latex2html-2023.2-1.1.noarch.rpm"
RPM_HASH = "9b69dd33033fc442c342080b54ae1a2b40f7b97cfbffca40a1270efa10c8947704c99266da1848aa45e908d74dff8e2ea292bfc5dcd2eb58aa6c0f5b89bcfdd8"
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
