SUMMARY = "Babel module to support Serbian Cyrillic"
DESCRIPTION = "The package provides support for Serbian documents written in \
Cyrillic, in babel."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2asvn64588"

RPM_NAME = "texlive-babel-serbianc-2023.201.3.2asvn64588-53.1.noarch.rpm"
RPM_HASH = "d2e73eb99cacac88fc5a7d4970a34f1e94db941167d9c547e687dbc8b122030c2f10bf7a1b1158b313e84fb8b7b93ead3266711114032f17a47d02a9c8bc73d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-serbianc.ldf \
texlive-babel-serbianc"

RDEPENDS:${PN} += "/bin/sh \
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
