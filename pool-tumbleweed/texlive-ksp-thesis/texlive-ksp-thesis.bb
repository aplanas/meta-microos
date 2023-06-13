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

PV = "2023.201.1.0.2svn39080"

RPM_NAME = "texlive-ksp-thesis-2023.201.1.0.2svn39080-55.1.noarch.rpm"
RPM_HASH = "b74a3a64c2084e7fd4764738729ebce10198557ea9a50e25c5bfbca032f8bd9f6cace09005feb75a46f4fb86f461867d3da7d5a3c56195619e92cef07c211c5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ksp-thesis.cls) \
texlive-ksp-thesis"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(arsclassica.sty) \
tex(classicthesis.sty) \
tex(etoolbox.sty) \
tex(hyperref.sty) \
tex(ragged2e.sty) \
tex(scrbook.cls) \
tex(scrlayer-scrpage.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
