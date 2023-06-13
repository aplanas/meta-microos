SUMMARY = "Embed XMP metadata within a LaTeX document"
DESCRIPTION = "XMP (eXtensible Metadata Platform) is a mechanism proposed by \
Adobe for embedding document metadata within the document \
itself. The metadata is designed to be easy to extract, even by \
programs that are oblivious to the document's file format. Most \
of Adobe's applications store XMP metadata when saving files. \
Now, with the hyperxmp package, it is trivial for LaTeX \
document authors to store XMP metadata in their documents as \
well. The package integrates seamlessly with hyperref and \
requires virtually no modifications to documents that already \
exploit hyperref's mechanisms for specifying PDF metadata. The \
current version of hyperxmp can embed the following metadata as \
XMP: title, authors, primary author's title or position, \
metadata writer, subject/summary, keywords, copyright, license \
URL, document base URL, document identifier and instance \
identifier, language, source file name, PDF generating tool, \
PDF version, and contact telephone number/postal address/email \
address/URL. Hyperxmp currently embeds XMP only within PDF \
documents; it is compatible with pdfLaTeX, XeLaTeX, \
LaTeX+dvipdfm, and LaTeX+dvips+ps2pdf."
LICENSE = "LPPL-1.0"

PV = "2023.201.5.11svn65980"

RPM_NAME = "texlive-hyperxmp-2023.201.5.11svn65980-52.1.noarch.rpm"
RPM_HASH = "a448f2eaf0ae70c332f23791256d1659d3efa1d3a04f4019219d5a39549e679bfb286ca3ae343e7089d8dcd6ea6eb1fe1986d76d4281892a6133c38c8e9e5a91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyperxmp.sty) \
texlive-hyperxmp"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(warnings) \
sed \
tex(atenddvi.sty) \
tex(etoolbox.sty) \
tex(hyperref.sty) \
tex(ifdraft.sty) \
tex(ifluatex.sty) \
tex(ifmtarg.sty) \
tex(iftex.sty) \
tex(ifthen.sty) \
tex(intcalc.sty) \
tex(kvoptions.sty) \
tex(luacode.sty) \
tex(pdfescape.sty) \
tex(stringenc.sty) \
texlive \
texlive-filesystem \
texlive-hyperxmp-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
