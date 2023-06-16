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

PV = "2023.201.2.0msvn31096"

RPM_NAME = "texlive-chemstyle-2023.201.2.0msvn31096-53.1.noarch.rpm"
RPM_HASH = "b2c6c32f35a1d6c7df3f5e22acb7480992594d00a24a24a7c5783f267c5abea990dfafef516a330de1023b5af188d91b0f3281bd0e2c8f30b455f58e5cf6377f"
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
