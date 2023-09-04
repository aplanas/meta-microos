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

PV = "2023.209.5.11svn65980"

RPM_NAME = "texlive-hyperxmp-2023.209.5.11svn65980-54.1.noarch.rpm"
RPM_HASH = "475988bad6d20c382786b2c37cbbd0ca4caf2cb76b390f1cb999bec3835863b2e9c4f641ff977374ddffed10c56289e9f874e5bec9ac3e329d87dcc5cf1ad808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyperxmp.sty \
texlive-hyperxmp"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-warnings \
sed \
tex-atenddvi.sty \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-ifdraft.sty \
tex-ifluatex.sty \
tex-ifmtarg.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-intcalc.sty \
tex-kvoptions.sty \
tex-luacode.sty \
tex-pdfescape.sty \
tex-stringenc.sty \
texlive \
texlive-filesystem \
texlive-hyperxmp-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
