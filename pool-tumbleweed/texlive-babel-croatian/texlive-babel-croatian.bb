SUMMARY = "Babel contributed support for Croatian"
DESCRIPTION = "The package establishes Croatian conventions in a document (or \
a subset of the conventions, if Croatian is not the main \
language of the document)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3lsvn35198"

RPM_NAME = "texlive-babel-croatian-2023.209.1.3lsvn35198-54.1.noarch.rpm"
RPM_HASH = "a56271ee97472342be42b323bdfc7c0d701d8a1cccf7535891814fbea02ba1c11de4d4d8a7ceb2b3540edbf05a203e0d4b6ee51bd1c330690f5548c64c0edbe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-croatian.ldf \
texlive-babel-croatian"

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
