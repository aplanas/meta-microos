SUMMARY = "Extending etoolbox patching commands"
DESCRIPTION = "The package generalises the macro patching commands provided by \
Philipp Lehmann's etoolbox."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn54563"

RPM_NAME = "texlive-xpatch-2023.201.0.0.3svn54563-52.2.noarch.rpm"
RPM_HASH = "7dc097360fa8d878957441afae071c3538f23b97114f92e753cd9cb4ab6158ac65398f49dcaf640e8848a436440208be191140298068c17460587c6ebe89e6ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xpatch.sty \
texlive-xpatch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
