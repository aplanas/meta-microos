SUMMARY = "German version of europecv"
DESCRIPTION = "This is a 'translation' of the europecv documentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn23840"

RPM_NAME = "texlive-translation-europecv-de-2023.209.svn23840-53.1.noarch.rpm"
RPM_HASH = "9b7a52a9a0816df9f482ede20b60ce712f7b6d334d292a63d5fc2682228d29e0b30532dd753b719bcc737040449de955a63e3cd4ed20985133f15a7149923bba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-europecv-de"

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
