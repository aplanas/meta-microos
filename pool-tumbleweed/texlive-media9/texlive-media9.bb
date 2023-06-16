SUMMARY = "Multimedia inclusion package with Adobe Reader-9/X compatibility"
DESCRIPTION = "The package provides an interface to embed interactive Flash \
(SWF) and 3D objects (Adobe U3D & PRC), as well as video and \
sound files or streams in the popular MP4, FLV and MP3 formats \
into PDF documents with Acrobat-9/X compatibility. Playback of \
multimedia files uses the built-in Flash Player of Adobe Reader \
and does, therefore, not depend on external plug-ins. Flash \
Player supports the efficient H.264 codec for video \
compression. The package is based on the RichMedia Annotation, \
an Adobe addition to the PDF specification. It replaces the now \
obsolete movie15 package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.25svn64047"

RPM_NAME = "texlive-media9-2023.201.1.25svn64047-52.1.noarch.rpm"
RPM_HASH = "3ba2173f620eb9b84f5454c2550ccf27dea4d38c6c96ba09347d40ac1c2d0d1a605cf9330e7b425fc8074fdbb2257f20f9a84f9a48a9cf1a73ea221d50dad294"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-media9.sty \
tex-pdfbase.sty \
texlive-media9"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ocgbase.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
