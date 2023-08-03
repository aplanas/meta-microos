SUMMARY = "Define keys for use in the kvsetkeys package"
DESCRIPTION = "The package provides a macro \\kv@define@key (analogous to \
keyval's \\define@key, to define keys for use by kvsetkeys."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn53193"

RPM_NAME = "texlive-kvdefinekeys-2023.209.1.6svn53193-56.1.noarch.rpm"
RPM_HASH = "56027a4f2d5ea5bdaffb1ec107f3b8ee8b2b5f4864139162ba0ad4d744249778d573b3d2dfc6c3cd0ee550192ee4b9d65fe427cab7f0dec6064e0fe2a9ac02e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kvdefinekeys.sty \
texlive-kvdefinekeys"

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
