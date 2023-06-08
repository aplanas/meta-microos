SUMMARY = "Provide latex backend dependencies"
DESCRIPTION = "AsciiDoc can generate pdf from asciidoc format through dblatex. For that it needs quite some \
latex dependencies that we don't want to have by default. So this package is optional."
LICENSE = "GPL-2.0-or-later"

PV = "10.2.0"

RPM_NAME = "asciidoc-latex-backend-10.2.0-1.4.noarch.rpm"
RPM_HASH = "f7831237e13a05adf616187e00e47fa30149f1194bcbdaacd503ab6f967d4b97e458dbc7ba59c4e10f4ee3b9fe1f745e2b0b96de2a425ce55d3bcca798e7c7a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "asciidoc-latex-backend"
RDEPENDS:${PN} += "asciidoc dblatex tex(8r.enc) tex(fancybox.sty) tex(mathrsfs.sty) tex(pcrr8c.tfm) tex(phvr8t.tfm) tex(ptmr8t.tfm) tex(ptmri7t.tfm) tex(rsfs10.tfm) tex(upquote.sty) tex(zptmcm7v.tfm) tex(zptmcm7y.tfm) texlive-metafont-bin"

inherit rpm
