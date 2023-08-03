SUMMARY = "German version of moreverb"
DESCRIPTION = "This is a 'translation' of the moreverb documentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn23957"

RPM_NAME = "texlive-translation-moreverb-de-2023.209.svn23957-53.1.noarch.rpm"
RPM_HASH = "54492b3656fb3cf59c4910b565e55e4784f5af85e6e7f980df6ca412ee52086394021d2100c7c4b56a3bb13d8e8eff5ae9eaab01409d39c47e24b79577e3c5cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-moreverb-de"

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
