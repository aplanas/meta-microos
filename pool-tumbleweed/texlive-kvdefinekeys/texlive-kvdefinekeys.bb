SUMMARY = "Define keys for use in the kvsetkeys package"
DESCRIPTION = "The package provides a macro \\kv@define@key (analogous to \
keyval's \\define@key, to define keys for use by kvsetkeys."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn53193"

RPM_NAME = "texlive-kvdefinekeys-2023.201.1.6svn53193-55.1.noarch.rpm"
RPM_HASH = "6a739ca7350fe7f27b9ed6c43ac636583c2bd7b246ed69bcf4d337b5c73840d0d09dda28b884717d7de8744a0fdbe717008a3fadb93d5246c2d738e1f9a0143f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kvdefinekeys.sty \
texlive-kvdefinekeys"

RDEPENDS:${PN} += "/bin/sh \
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
