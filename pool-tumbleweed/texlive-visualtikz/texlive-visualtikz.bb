SUMMARY = "Visual help for TikZ based on images with minimum text"
DESCRIPTION = "Visual help for TikZ based on images with minimum text: an \
image per command or parameter. The document is in French, but \
will be translated into English later."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.65svn54080"

RPM_NAME = "texlive-visualtikz-2023.209.0.0.65svn54080-54.1.noarch.rpm"
RPM_HASH = "c147d7fd136f20a5e1c8ad74b69e37b288398cfbcfee12661bd64b9731ccfccaa2ec29e4b7f2a52022a588d544b55ef872f9d750a0aa256c90f905fa3801616e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-visualtikz"

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
