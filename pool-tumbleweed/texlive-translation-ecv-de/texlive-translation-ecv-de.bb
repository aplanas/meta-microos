SUMMARY = "Ecv documentation, in German"
DESCRIPTION = "This is a 'translation' of the ecv documentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn24754"

RPM_NAME = "texlive-translation-ecv-de-2023.209.svn24754-53.1.noarch.rpm"
RPM_HASH = "0e7fdc9278be4fcfa02a7ab232f6ef66d23c78f5955ca4f6ab8b65e074e8286e2533031abcd93a5a59ed37d488b52cce58d71a3768ef098ebaabc2f92aaefd0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-ecv-de"

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
