SUMMARY = "Extending etoolbox patching commands"
DESCRIPTION = "The package generalises the macro patching commands provided by \
Philipp Lehmann's etoolbox."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn54563"

RPM_NAME = "texlive-xpatch-2023.209.0.0.3svn54563-53.2.noarch.rpm"
RPM_HASH = "fdbd65dc7159c6bb82da0737e9acc28c3c964bad65b3e9c76dbc2b49ddc9a639e32a735feabcb630cac3f813f1c130b484c226bd8bcf81f0b14442916454a5ab"
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
