SUMMARY = "Key value format for package options"
DESCRIPTION = "This package offers support for package authors who want to use \
options in key-value format for their package options."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.15svn63622"

RPM_NAME = "texlive-kvoptions-2023.209.3.15svn63622-56.1.noarch.rpm"
RPM_HASH = "ddf7cf82abea42ba468d28d152a5088e35c8cf014dc5d86d5fbe59e3566032772c7137a9168cd0d0a7f446300e898c79c6f470fe337e26e07c95fd07c3cb480c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kvoptions-patch.sty \
tex-kvoptions.sty \
texlive-kvoptions"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etexcmds.sty \
tex-keyval.sty \
tex-kvsetkeys.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
