SUMMARY = "A short guide to using LaTeX2e to typeset high quality documents"
DESCRIPTION = "This document is a short guide to using LaTeX2e to typeset high \
quality documents. It focuses on users of Windows and guides \
the reader through installation, some of LaTeX's conventions, \
and creating the front matter, body and end matter. The \
appendices contain a list of useful facilities not otherwise \
covered in this document and a list of helpful resources."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.201.1.1svn65714"

RPM_NAME = "texlive-yet-another-guide-latex2e-2023.201.1.1svn65714-52.2.noarch.rpm"
RPM_HASH = "fd9e9d9142ed34bfd46c62cb1347083342f214a6eac407ae8080f154037a7ad3cdeed39013ee8b67a0d11afa9a3c01a08abc71453e8793aed9aae03f22b9a4f1"
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
