SUMMARY = "Support for CJK documents in XeLaTeX"
DESCRIPTION = "A LaTeX package for typesetting CJK documents in the way users \
have become used to, in the CJK package. The package requires a \
current version of xtemplate (and hence of the current LaTeX3 \
development environment)."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.9.1svn64059"

RPM_NAME = "texlive-xecjk-2023.209.3.9.1svn64059-53.2.noarch.rpm"
RPM_HASH = "6c9c433a88197599a823a9e8cf0f272e080788c69df615e2871fff8ece17b52e984e9950af0cc61556ffdeda0abe2475d1bc93b5dd314eeb8ec9f38e5be9e0a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-full-stop.map \
tex-fullwidth-stop.map \
tex-han-simp.map \
tex-han-trad.map \
tex-xeCJK-listings.sty \
tex-xeCJK.cfg \
tex-xeCJK.sty \
tex-xeCJKfntef.sty \
tex-xunicode-addon.sty \
tex-xunicode-extra.def \
texlive-xecjk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ctexhook.sty \
tex-expl3.sty \
tex-fontspec.sty \
tex-l3keys2e.sty \
tex-listings.sty \
tex-ulem.sty \
tex-xparse.sty \
tex-xtemplate.sty \
tex-xunicode.sty \
texlive \
texlive-ctex \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
