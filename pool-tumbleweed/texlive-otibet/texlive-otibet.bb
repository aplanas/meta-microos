SUMMARY = "Support for Tibetan using Omega"
DESCRIPTION = "The otibet package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45777"

RPM_NAME = "texlive-otibet-2023.209.svn45777-55.1.noarch.rpm"
RPM_HASH = "ceb044506100e17f80a0ae3bde392e3d7efce928e0a4715aa7c09385bb7cd5632641d6aa1ba77cba6254bd18cc2510c7cb4df6d52fefc5963b84ffcb7c1fed6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ot1tib.fd \
tex-otibet.sty \
tex-otibet.tex \
tex-t1tib.fd \
tex-tibetan.tfm \
texlive-otibet"

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
