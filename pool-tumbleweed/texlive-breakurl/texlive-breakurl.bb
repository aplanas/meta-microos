SUMMARY = "Line-breakable \\url-like links in hyperref when compiling via dvips/ps2pdf"
DESCRIPTION = "This package provides a command much like hyperref's \\url that \
typesets a URL using a typewriter-like font. However, if the \
dvips driver is being used, the original \\url doesn't allow \
line breaks in the middle of the created link: the link comes \
in one atomic piece. This package allows such line breaks in \
the generated links."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.40svn29901"

RPM_NAME = "texlive-breakurl-2023.209.1.40svn29901-53.1.noarch.rpm"
RPM_HASH = "2a5f299ce4d26406ed423dbe220ba391d63eaaa582eb01bbf6ae57b6d3bd2c792054b89622b60aeb4e3edf94a26455acaa4a0dae7036c0daf02b57d0b30452ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-breakurl.sty \
texlive-breakurl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifpdf.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
