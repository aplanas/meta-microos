SUMMARY = "LaTeX pictures 'how-to' (German)"
DESCRIPTION = "The document (in German) is a collection of 'how-to' notes \
about LaTeX and pictures. The aim of the document is to provide \
a solution, in the form of some sample code, for every problem."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.209.1.50svn19601"

RPM_NAME = "texlive-l2picfaq-2023.209.1.50svn19601-56.1.noarch.rpm"
RPM_HASH = "55d15b91b262922f104e13553dbe43e9f9ec5f0f657a8139d8a3c84d8f1700d785d619f47dd088fa368352d7bfb0ab8a1ca37288868b6984fc83ba084856e914"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l2picfaq"

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
