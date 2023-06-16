SUMMARY = "Multimedia inclusion package"
DESCRIPTION = "The package provides an interface to embed movies, sounds and \
3D objects into PDF documents for use with LaTeX as well as \
pdfLaTeX. The package defines a command \\includemovie with \
PDF-1.5 compatibility. Option 'autoplay' causes the media clip \
to be started right after the page has loaded. This is useful \
for side by side movie clips to be played back synchronously. \
The package is now superseded by media9"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn26473"

RPM_NAME = "texlive-movie15-2023.201.svn26473-54.1.noarch.rpm"
RPM_HASH = "5576e4ad547142999c2ea440fa2e3a053c22acf06927ffe054853f16c976b6ec125e18dacedfd69d2b323448d6224d4c1b01aeddf52e16eda1c62903623906e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-movie15.sty \
texlive-movie15"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everyshi.sty \
tex-fp.sty \
tex-ifdraft.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
