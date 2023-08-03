SUMMARY = "Italian translation of amsldoc"
DESCRIPTION = "The amsldoc-it package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45662"

RPM_NAME = "texlive-amsldoc-it-2023.209.svn45662-55.1.noarch.rpm"
RPM_HASH = "89513f0368f6a3e0812365a99f756582cff010d60587957c99052d6b61483d9b3917a12a12d21da9b6303efb852409a34afa80e88d8dec7b9821aaf7994b82a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amsldoc-it"

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
