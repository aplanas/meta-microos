SUMMARY = "Put a grey textual watermark on document pages"
DESCRIPTION = "The package provides a means to add a watermark (typically a \
light gray piece of text) on every page or on the first page of \
a document. Typical usage may consist in writing words such as \
DRAFT or CONFIDENTIAL across document pages. The package \
performs a similar function to that of draftcopy, but its \
implementation is output device independent. As of today, the \
package relies on the new shipout hooks directly provided by \
LaTeX. For users of older versions of LaTeX, the package also \
provides a legacy version of itself (that is automatically \
loaded, currently being at release 2.3) which relies on the \
everypage package. Note that this legacy version will \
progressively lag behind in terms of features."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn57099"

RPM_NAME = "texlive-draftwatermark-2023.209.3.0svn57099-53.1.noarch.rpm"
RPM_HASH = "abc40b84fee8b2b34840ac9ded4992fd6c31ace97c95f2cd3c4fad2829a1fa4c1ba134e20f95488216b0c4bdc510cc732a7bcdf67cd824b1b3a91d66e79681ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-draftwatermark-2x.sty \
tex-draftwatermark.sty \
texlive-draftwatermark"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-everypage.sty \
tex-graphicx.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
