SUMMARY = "Line-breakable \\url-like links in hyperref when compiling via dvips/ps2pdf"
DESCRIPTION = "This package provides a command much like hyperref's \\url that \
typesets a URL using a typewriter-like font. However, if the \
dvips driver is being used, the original \\url doesn't allow \
line breaks in the middle of the created link: the link comes \
in one atomic piece. This package allows such line breaks in \
the generated links."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.40svn29901"

RPM_NAME = "texlive-breakurl-2023.201.1.40svn29901-52.1.noarch.rpm"
RPM_HASH = "2617cf12ff35d7ec5d21d4aa78f815517a56b8776b525421ae127005770722bbebc6ff6e843c880a578c1bf6ec8d986a858765621fa30e19a0bf9942df0af1a0"
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
