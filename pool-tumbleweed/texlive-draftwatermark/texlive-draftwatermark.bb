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

PV = "2023.201.3.0svn57099"

RPM_NAME = "texlive-draftwatermark-2023.201.3.0svn57099-52.1.noarch.rpm"
RPM_HASH = "133b6b897707825357d9a5957fa04a8fd256cda454e423f03b41f33c3e2093847c44819a3060a1e1b1c557d8690329f018c78dceb74cbfec02217f9e2ad9363c"
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
