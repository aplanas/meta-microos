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

PV = "2023.201.1.8svn21472"

RPM_NAME = "texlive-enumitem-zref-2023.201.1.8svn21472-53.2.noarch.rpm"
RPM_HASH = "b8c87c940740e0208452092128d9ddea52644dfc6cf017b0198035cf66e3dfc362fa5c02d7827acd9745374d38cd897bd2265126f6a032b3a1a7783928ed2585"
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
