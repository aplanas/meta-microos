SUMMARY = "Typesetting academic works according to ABNT rules"
DESCRIPTION = "The ABNT package provides a clean and practical implementation \
of the ABNT rules for academic texts. Its purpose is to be as \
simple and user-friendly as possible."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn55471"

RPM_NAME = "texlive-abnt-2023.201.svn55471-54.1.noarch.rpm"
RPM_HASH = "678f19a724b5f140fad90de337f65e7d41860d11a2456094064247d0937c3f72e8959beee5bff8ef4f2594fb9148a28034c1e77a88c547b535a160add764b93f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abnt.sty \
texlive-abnt"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption.sty \
tex-chngcntr.sty \
tex-emptypage.sty \
tex-enumerate.sty \
tex-etoolbox.sty \
tex-geometry.sty \
tex-newfloat.sty \
tex-scrlayer-scrpage.sty \
tex-setspace.sty \
tex-tocbasic.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
