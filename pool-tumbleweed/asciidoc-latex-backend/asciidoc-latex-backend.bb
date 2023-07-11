SUMMARY = "Provide latex backend dependencies"
DESCRIPTION = "AsciiDoc can generate pdf from asciidoc format through dblatex. For that it needs quite some \
latex dependencies that we don't want to have by default. So this package is optional."
LICENSE = "GPL-2.0-or-later"

PV = "10.2.0"

RPM_NAME = "asciidoc-latex-backend-10.2.0-1.5.noarch.rpm"
RPM_HASH = "095586bc7da99afc13f531d11c3b1dc8c8a2c757aa6193660355636892ed3c13b1fc9da01aec20e948076e384750e3c241009d05cbb7c76ab080f237b954bf29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "asciidoc-latex-backend"

RDEPENDS:${PN} += "asciidoc \
dblatex \
tex-8r.enc \
tex-fancybox.sty \
tex-mathrsfs.sty \
tex-pcrr8c.tfm \
tex-phvr8t.tfm \
tex-ptmr8t.tfm \
tex-ptmri7t.tfm \
tex-rsfs10.tfm \
tex-upquote.sty \
tex-zptmcm7v.tfm \
tex-zptmcm7y.tfm \
texlive-metafont-bin"

inherit rpm
