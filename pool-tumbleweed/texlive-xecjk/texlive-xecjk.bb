SUMMARY = "Support for CJK documents in XeLaTeX"
DESCRIPTION = "A LaTeX package for typesetting CJK documents in the way users \
have become used to, in the CJK package. The package requires a \
current version of xtemplate (and hence of the current LaTeX3 \
development environment)."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.9.1svn64059"

RPM_NAME = "texlive-xecjk-2023.201.3.9.1svn64059-52.2.noarch.rpm"
RPM_HASH = "22aa52b10133d9e0e7b808c380fd781dc84b0a0de32e59c44842f341cb00c4cd3b77e84716d0a69ef535719308319c3217032f0ff28de27880a307d1efa5debf"
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
