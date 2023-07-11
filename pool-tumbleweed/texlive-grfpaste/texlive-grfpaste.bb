SUMMARY = "Include fragments of a dvi file"
DESCRIPTION = "Provides a mechanism to include fragments of dvi files with the \
graphicx package, so that you can use \\includegraphics to \
include dvi files. The package requires the dvipaste program."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn17354"

RPM_NAME = "texlive-grfpaste-2023.201.0.0.2svn17354-53.2.noarch.rpm"
RPM_HASH = "39671cc234171df67772b1099968d20d6127a6649d862ceabbd57769ca3db7cfac623093f59c0540bdc47d6aa7c7c24d7796aee8eefcaf10b65ad89136019f5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grfpaste.sty \
texlive-grfpaste"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
