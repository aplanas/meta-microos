SUMMARY = "A range of sub- and superscript commands"
DESCRIPTION = "The package provides a comprehensive and flexible set of \
commands for combinations of left and right sub- and \
superscripts."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn16080"

RPM_NAME = "texlive-subsupscripts-2023.209.1.0svn16080-58.1.noarch.rpm"
RPM_HASH = "4126c103208f3f0dc74c1f523822b6d760b7a28bcf8d9b83211d79de7202fdf78121391450ef3f2a48bd14694b0dbcb6a3af48eb9ebd93782158f1ab410c9aca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subsupscripts.sty \
texlive-subsupscripts"

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
