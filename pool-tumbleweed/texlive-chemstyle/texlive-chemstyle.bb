SUMMARY = "Writing chemistry with style"
DESCRIPTION = "Chemstyle has been developed as a successor to the LaTeX \
package provided by the rsc bundle. The package provides an \
extensible system for formatting chemistry documents according \
to the conventions of a number of leading journals. It also \
provides some handy chemistry-related macros. Chemstyle is much \
enhanced compared to its predecessor, and users of rsc are \
strongly encouraged to migrate (all of the additional macros in \
the rsc LaTeX package are present in chemstyle). The package \
chemscheme is distributed with chemstyle; chemstyle itself \
incorporates ideas that come from the trivfloat package; the \
documentation uses the auto-pst-pdf package."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0msvn31096"

RPM_NAME = "texlive-chemstyle-2023.209.2.0msvn31096-54.1.noarch.rpm"
RPM_HASH = "9d74b361e03fc1c5088c0e490cb59c85205c4e4feb9881507bd0c545a3f7982bbec7a07aa87b17e8b241862eab1d639b9542ddeff8bd97d9d27c558913ce9099"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-angew.chemstyle.cfg \
tex-chemscheme.sty \
tex-chemstyle.sty \
tex-ic.chemstyle.cfg \
tex-jacs.chemstyle.cfg \
tex-jomc.chemstyle.cfg \
tex-orglett.chemstyle.cfg \
tex-rsc.chemstyle.cfg \
tex-tetlett.chemstyle.cfg \
texlive-chemstyle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-SIunits.sty \
tex-amstext.sty \
tex-bpchem.sty \
tex-caption.sty \
tex-chemcompounds.sty \
tex-float.sty \
tex-floatrow.sty \
tex-kvoptions.sty \
tex-psfrag.sty \
tex-siunitx.sty \
tex-varioref.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
