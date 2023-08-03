SUMMARY = "A LaTeX class for theses published with KIT Scientific Publishing"
DESCRIPTION = "This package provides a LaTeX class intended for authors who \
want to publish their thesis or other scientific work with KIT \
Scientific Publishing (KSP). The class is based on the scrbook \
class of the KOMA-script bundle in combination with the \
ClassicThesis and ArsClassica packages. It modifies some of the \
layout and style definitions of these packages in order to \
provide a document layout that should be compatible with the \
requirements by KSP."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn39080"

RPM_NAME = "texlive-ksp-thesis-2023.209.1.0.2svn39080-56.1.noarch.rpm"
RPM_HASH = "db4ad69ce97ee17dd3b995cb3c290922ef6c6313baa049f30bf4deaba92eecf60fbc78e3d64ba7e6a57a8cb9910c124907e4bebf663d9933eb6df64558c57fc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ksp-thesis.cls \
texlive-ksp-thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-arsclassica.sty \
tex-classicthesis.sty \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-ragged2e.sty \
tex-scrbook.cls \
tex-scrlayer-scrpage.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
