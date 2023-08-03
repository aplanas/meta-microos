SUMMARY = "Font Awesome 5 with LaTeX support"
DESCRIPTION = "This package provides LaTeX support for the included 'Font \
Awesome 5 Free' icon set. These icons were designed by Fort \
Awesome and released under the SIL OFL 1.1 license. The \
commercial 'Pro' version is also supported, if it is installed \
and XeLaTeX or LuaLaTeX is used."
LICENSE = "OFL-1.1"

PV = "2023.209.5.15.4svn63207"

RPM_NAME = "texlive-fontawesome5-2023.209.5.15.4svn63207-53.1.noarch.rpm"
RPM_HASH = "673861d366301320891361c5390cbd45ca7b00334f20d3293332b5c3147a45189dcb17b746cfb4bff97d0060f27e18d86ec222187aae7d01d80de07b81cc3f5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fa5brands0.enc \
tex-fa5brands0.tfm \
tex-fa5brands1.enc \
tex-fa5brands1.tfm \
tex-fa5free0.enc \
tex-fa5free0regular.tfm \
tex-fa5free0solid.tfm \
tex-fa5free1.enc \
tex-fa5free1regular.tfm \
tex-fa5free1solid.tfm \
tex-fa5free2.enc \
tex-fa5free2regular.tfm \
tex-fa5free2solid.tfm \
tex-fa5free3.enc \
tex-fa5free3regular.tfm \
tex-fa5free3solid.tfm \
tex-fontawesome5-generic-helper.sty \
tex-fontawesome5-mapping.def \
tex-fontawesome5-utex-helper.sty \
tex-fontawesome5.map \
tex-fontawesome5.sty \
tex-tufontawesomebrands.fd \
tex-tufontawesomefree.fd \
tex-tufontawesomepro.fd \
tex-ufontawesomebrands0.fd \
tex-ufontawesomebrands1.fd \
tex-ufontawesomefree0.fd \
tex-ufontawesomefree1.fd \
tex-ufontawesomefree2.fd \
tex-ufontawesomefree3.fd \
texlive-fontawesome5"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-luatexbase.sty \
tex-updmap.cfg \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-fontawesome5-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
