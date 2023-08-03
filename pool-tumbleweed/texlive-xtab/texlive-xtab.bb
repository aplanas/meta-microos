SUMMARY = "Break tables across pages"
DESCRIPTION = "Xtab is an extended and somewhat improved version of \
supertabular; its xtabular environment provides tables that \
break across pages."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3fsvn23347"

RPM_NAME = "texlive-xtab-2023.209.2.3fsvn23347-53.1.noarch.rpm"
RPM_HASH = "7f17a4b69b32f5785c4f0e327d45df53dd0265bf50f561fb656434e862188aa994a495996195a9e7235097d2eeb346c84ac190ae24a5df53f7d9119af3747975"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xtab.sty \
texlive-xtab"

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
