SUMMARY = "Use the text font in maths mode"
DESCRIPTION = "The package uses a text font (usually the document's text font) \
for the letters of the Latin alphabet needed when typesetting \
mathematics. (Optionally, other characters in the font may also \
be used). This facility makes possible (for a document with \
simple mathematics) a far wider choice of text font, with \
little worry that no specially designed accompanying maths \
fonts are available. The package also offers a simple mechanism \
for using many different choices of (text hence, now, maths) \
font in the same document. Of course, using one font for two \
purposes helps produce smaller PDF files."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.3ysvn64930"

RPM_NAME = "texlive-mathastext-2023.208.1.3ysvn64930-53.1.noarch.rpm"
RPM_HASH = "13f52f0faabba278581fdbaf8b3e61cf54f02e536d7a42c130a8cc5fe8fcf644f7b37eae91c553a94f1a0018e28e673c2972e409e7a48d84d58cc402a601f898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathastext.sty \
texlive-mathastext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ncccomma.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
