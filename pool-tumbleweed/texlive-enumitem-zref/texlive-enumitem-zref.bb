SUMMARY = "Extended references to items for enumitem package"
DESCRIPTION = "The package is a companion for the enumitem package; it makes \
it possible to reference any item in lists formatted by \
enumitem lists, viz., enumerated, itemize and description \
lists, and any list defined (or customised) with \\newlist or \
\\setlist. References may be typeset differently with \
options/properties and even arbitrary text. With hyperref, \
anchors are added for each item to enable hyperlinks within the \
document or even to external documents. Three schemes are \
provided to make reference names (including the standard \\label \
command)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn21472"

RPM_NAME = "texlive-enumitem-zref-2023.209.1.8svn21472-54.1.noarch.rpm"
RPM_HASH = "8ccc2ce019aaa749ce516d879f379cb9d058a94200f39c99112f76a2daeaed1ddbd319f1a21bc2dcaf9497fe59a98740cd2e559b3df4635608a32081de5694f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-enumitem-zref.sty \
texlive-enumitem-zref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphalph.sty \
tex-engrec.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-gettitlestring.sty \
tex-greekctr.sty \
tex-kvoptions.sty \
tex-ltxcmds.sty \
tex-zref-counter.sty \
tex-zref-user.sty \
tex-zref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
