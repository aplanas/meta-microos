SUMMARY = "A short guide to using LaTeX2e to typeset high quality documents"
DESCRIPTION = "This document is a short guide to using LaTeX2e to typeset high \
quality documents. It focuses on users of Windows and guides \
the reader through installation, some of LaTeX's conventions, \
and creating the front matter, body and end matter. The \
appendices contain a list of useful facilities not otherwise \
covered in this document and a list of helpful resources."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.209.1.1svn65714"

RPM_NAME = "texlive-yet-another-guide-latex2e-2023.209.1.1svn65714-53.2.noarch.rpm"
RPM_HASH = "07d586eee0658d1134be021a5e0819ba98dcaecf15d8b04d530d448c389f1f30d3238527bb38593744124c4259ca47282c3c2981167f68289624e99319cb69c9"
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
