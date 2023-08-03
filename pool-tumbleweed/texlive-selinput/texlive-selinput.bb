SUMMARY = "Semi-automatic detection of input encoding"
DESCRIPTION = "This package selects the input encoding by specifying pairs of \
input characters and their glyph names."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn53098"

RPM_NAME = "texlive-selinput-2023.209.1.6svn53098-54.1.noarch.rpm"
RPM_HASH = "bf721a41ce5afa9246e4069a8a91912eb2f906f1d5a618ae75c5a5c9bf6ccc6e0685a4dda58e7ce8dcabf742f542b3928cc6fc095eaed04fd30a226ef0f032f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-selinput.sty \
texlive-selinput"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-inputenc.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-stringenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
