SUMMARY = "Preserving and recalling standard catcodes"
DESCRIPTION = "The package changes package loading internals so that all \
subsequently loaded packages can rely on normal/standard \
catcodes of all ASCII characters. The package defines canonical \
control sequences to represent all the visible ASCII \
characters. It also provides robust option parsing mechanisms \
(XDeclareOption, XExecuteOptions and XProcessOptions, which \
will be used by \\documentclass if the package has already been \
loaded). The package also provides a range of other TeX \
programming tools."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.7hsvn35069"

RPM_NAME = "texlive-catoptions-2023.209.0.0.2.7hsvn35069-53.1.noarch.rpm"
RPM_HASH = "bca314088a926910c635f731a42a737a0e54a56402714944e69b87da3b74e19dcd10d72dd3ea6fe6b298922403088cd05fd22f8882b123dfcd34e981c19eb3ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-catoptions-guide.cfg \
tex-catoptions.sty \
texlive-catoptions"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
