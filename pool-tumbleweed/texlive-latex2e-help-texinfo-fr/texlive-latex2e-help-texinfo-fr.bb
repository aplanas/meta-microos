SUMMARY = "A French translation of 'latex2e-help-texinfo'"
DESCRIPTION = "This package provides a complete French translation of \
latex2e-help-texinfo."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn64228"

RPM_NAME = "texlive-latex2e-help-texinfo-fr-2023.209.svn64228-55.1.noarch.rpm"
RPM_HASH = "f8876da9c10a3aa426878963ae856564028985b142123082fee2da6def9c756235a59c3f946c81c8cfa3f027ad7593d29d6f484f597a65963af118bf51b4b8cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex2e-help-texinfo-fr"

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
