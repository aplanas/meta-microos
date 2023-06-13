SUMMARY = "Extending etoolbox patching commands"
DESCRIPTION = "The package generalises the macro patching commands provided by \
Philipp Lehmann's etoolbox."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn54563"

RPM_NAME = "texlive-xpatch-2023.201.0.0.3svn54563-52.1.noarch.rpm"
RPM_HASH = "a8c5c6813bc4012405851ce56a07797d6304fd9f1d83f42eb863ddd974cb4d26d0daaf0c38c934c34a196dcb3de973b8e5617daab5dfa983430283f933052e70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xpatch.sty) \
texlive-xpatch"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(expl3.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
