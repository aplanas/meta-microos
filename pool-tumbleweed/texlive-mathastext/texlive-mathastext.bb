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

PV = "2023.201.1.3ysvn64930"

RPM_NAME = "texlive-mathastext-2023.201.1.3ysvn64930-52.1.noarch.rpm"
RPM_HASH = "ec269d83d7bdc7cbea3f2b24014732fc15fc8a865a811ef227938e0135540a58dc0e22a1ea19943e86f2483a4629f800121c609cb06f238f63b8ffb6e3378c1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathastext.sty \
texlive-mathastext"

RDEPENDS:${PN} += "/bin/sh \
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
