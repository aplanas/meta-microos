SUMMARY = "A fast DVI to PNG/GIF converter"
DESCRIPTION = "This program makes PNG and/or GIF graphics from DVI files as \
obtained from TeX and its relatives. Its benefits include: \
Speed. It offers very fast rendering of DVI as bitmap files, \
which makes it suitable for generating large amounts of images \
on-the-fly, as needed in preview-latex, WeBWorK and others; It \
does not read the postamble, so it can be started before TeX \
finishes. There is a --follow switch that makes dvipng wait at \
end-of-file for further output, unless it finds the POST marker \
that indicates the end of the DVI; Interactive query of \
options. dvipng can read options interactively through stdin, \
and all options are usable. It is even possible to change the \
input file through this interface. Support for PK, VF, \
PostScript Type1, and TrueType fonts, colour specials, and \
inclusion of PostScript, PNG, JPEG or GIF images."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.1.17svn66203"

RPM_NAME = "texlive-dvipng-2023.209.1.17svn66203-54.2.noarch.rpm"
RPM_HASH = "3f0176011dcacd194c9ab8b7e65ba478f141f9f03b91b0da18433717656de5ad0d5c8ea65a115306bbaf054afa7fa69ab842b534821586cc815e667b3aad1890"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvigif.1 \
man-dvipng.1 \
texlive-dvipng"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dvipng-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
