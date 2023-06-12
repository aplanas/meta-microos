SUMMARY = "Create fancy boxed ((sub)sub)sections"
DESCRIPTION = "Sectionbox is a LaTeX package for putting fancy colored boxes \
around sections, subsections, and subsubsections, especially \
for use in posters, etc. It was designed with the sciposter \
class in mind, and certainly works with that class and with \
derived classes."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn37749"

RPM_NAME = "texlive-sectionbox-2023.201.1.01svn37749-53.1.noarch.rpm"
RPM_HASH = "0a65c83697d44771ab05db45a4bc002236d684e230ade09b45089e90c69cafd6c4edc19378be185f5fa638b6ebae172ddd5f4e2cb20c768b02415b45ba62173d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(sectionbox.sty) \
texlive-sectionbox"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(color.sty) \
tex(fancybox.sty) \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
