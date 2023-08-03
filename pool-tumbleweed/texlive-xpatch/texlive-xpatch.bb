SUMMARY = "Extending etoolbox patching commands"
DESCRIPTION = "The package generalises the macro patching commands provided by \
Philipp Lehmann's etoolbox."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn54563"

RPM_NAME = "texlive-xpatch-2023.209.0.0.3svn54563-53.1.noarch.rpm"
RPM_HASH = "c0bde8ddab72c357ad9d752656704125f2c6bcf0a72dd3d4189195fe6db7ec03cb4ccee28c12c9a5269b3f5b38fe15897026c98bd5545408cd86b200d009c9db"
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
