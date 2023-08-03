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

RPM_NAME = "texlive-dvipng-2023.209.1.17svn66203-54.1.noarch.rpm"
RPM_HASH = "76fbc5da38e2f0be64cb77bc58fce9492509daf1027f6ec490791fe33416e2e465c06807dd02120cc0dedd135272344a6a5cdd13dc03f7da1439983453d8659d"
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
