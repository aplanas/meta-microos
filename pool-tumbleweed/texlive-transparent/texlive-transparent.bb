SUMMARY = "Using a color stack for transparency with pdfTeX"
DESCRIPTION = "pdfTeX and LuaTeX support several color stacks. This package \
shows how a separate color stack can be used for transparency, \
a property besides color that works across page breaks. If the \
PDF management is used it can also be used with other engines, \
but without support for page breaks."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn64852"

RPM_NAME = "texlive-transparent-2023.209.1.5svn64852-53.1.noarch.rpm"
RPM_HASH = "f442f2c08157e370aa9ab23bb51dcfaeec3d2f5abdd3137edde756479ed10c2edde556d282314275ecd15fbb1b5a7d0a377cd39ef0e425de14263f5cea7cbc42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-transparent-nometadata.sty \
tex-transparent.sty \
texlive-transparent"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-auxhook.sty \
tex-iftex.sty \
tex-l3opacity.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
