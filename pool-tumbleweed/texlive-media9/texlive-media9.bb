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

PV = "2023.208.1.25svn64047"

RPM_NAME = "texlive-media9-2023.208.1.25svn64047-53.1.noarch.rpm"
RPM_HASH = "da37059fbb99bb21aea0f8a75f8cd9d4ecb26b44d2233ef14ee53a3189e4049b39739283e0c3ffb409b7ac212df1d25a4d34892435adcb99a774c29a19cbb46f"
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
