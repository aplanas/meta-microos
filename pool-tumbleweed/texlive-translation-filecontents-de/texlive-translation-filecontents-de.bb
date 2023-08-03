SUMMARY = "German version of filecontents"
DESCRIPTION = "This is a 'translation' of the filecontents documentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn24010"

RPM_NAME = "texlive-translation-filecontents-de-2023.209.svn24010-53.1.noarch.rpm"
RPM_HASH = "0a4cf0b8debe2764b07439d4296d8317b3aa3ff69acbcbb61d876af8629ad661ee9056d59f4dacd7ac3c4c5ef2a607807c0ba21405e95c76ff2ecd64561b7db7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-filecontents-de"

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
