SUMMARY = "A short guide to using LaTeX2e to typeset high quality documents"
DESCRIPTION = "This document is a short guide to using LaTeX2e to typeset high \
quality documents. It focuses on users of Windows and guides \
the reader through installation, some of LaTeX's conventions, \
and creating the front matter, body and end matter. The \
appendices contain a list of useful facilities not otherwise \
covered in this document and a list of helpful resources."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.209.1.1svn65714"

RPM_NAME = "texlive-yet-another-guide-latex2e-2023.209.1.1svn65714-53.1.noarch.rpm"
RPM_HASH = "9ba00060a8ee3bce10d4edc4b527da2dd492d6cb7c467d83f72563deb8a4ab2d6c544fae40f721f24a65d4a7d378a2fac15cfc5c72cb90360b9c3a01b6ea60b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yet-another-guide-latex2e"

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
texlive-scripts \
texlive-scripts-bin"

inherit rpm
