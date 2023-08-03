SUMMARY = "Multimedia inclusion package"
DESCRIPTION = "The package provides an interface to embed movies, sounds and \
3D objects into PDF documents for use with LaTeX as well as \
pdfLaTeX. The package defines a command \\includemovie with \
PDF-1.5 compatibility. Option 'autoplay' causes the media clip \
to be started right after the page has loaded. This is useful \
for side by side movie clips to be played back synchronously. \
The package is now superseded by media9"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn26473"

RPM_NAME = "texlive-movie15-2023.209.svn26473-55.1.noarch.rpm"
RPM_HASH = "bbf984b7768fa2cdddcf3ff157cfb7779b3de80aacdfe816d0d183c65b65fe7ca944532220a5cc7ba6abd89dcaf6af3c4998e80e40f8fbd1736ee7cc793f4093"
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
