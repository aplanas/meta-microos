SUMMARY = "Sample titlepages, and how to code them"
DESCRIPTION = "The document provides examples of over two dozen title page \
designs based on a range of published books and theses, \
together with the LaTeX code used to create them."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn19457"

RPM_NAME = "texlive-titlepages-2023.209.svn19457-53.1.noarch.rpm"
RPM_HASH = "21afa172e04553fcafe79a6aa3ead2016edd31e4beb863c971ab16f46195cd5cb2541deb80f2fd0da59ed858cd7a8b454d0e48f58fd69ed1fe96d9df30c06af3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-titlepages"

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
