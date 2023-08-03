SUMMARY = "Shell scripts interfacing to pdfpages"
DESCRIPTION = "The package makes available the pdfjam shell script that \
provides a simple interface to much of the functionality of the \
excellent pdfpages package (by Andreas Matthias) for LaTeX. The \
pdfjam script takes one or more PDF files (and/or JPG/PNG \
graphics files) as input, and produces one or more PDF files as \
output. It is useful for joining files together, selecting \
pages, reducing several source pages onto one output page, \
etc., etc."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.03svn56991"

RPM_NAME = "texlive-pdfjam-2023.209.3.03svn56991-52.1.noarch.rpm"
RPM_HASH = "aef6d32a78272dff8053061cf6304e2549d91289dce373179213fccd061e6515e8b7467a8c70beab86d5987917799461fc7f61554ee3a3259a95a8d0ddf8382f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfjam"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pdfjam-bin \
texlive-pdfpages \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
