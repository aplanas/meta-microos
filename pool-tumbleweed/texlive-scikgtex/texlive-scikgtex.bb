SUMMARY = "Mark research contributions in scientific documents and embed them in PDF metadata"
DESCRIPTION = "Scientific Knowledge Graph TeX (SciKgTeX) is a LuaLaTeX package \
which makes it possible to annotate specific research \
contributions in scientific documents. SciKGTeX will enrich the \
document by adding the marked contributions to PDF metadata in \
a structured XMP format which can be picked up by search \
engines and knowledge graphs."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.1svn65256"

RPM_NAME = "texlive-scikgtex-2023.201.2.1.1svn65256-53.1.noarch.rpm"
RPM_HASH = "561755a7f5a2bc22b696a35772a8304c1016b28e41280de2c7f17603aa38379ca4e031dc6dd18cb925d612e84decbf8bbbec1de653910b37fd8f031af9e22a43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(scikgtex.sty) \
texlive-scikgtex"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(hyperref.sty) \
tex(suffix.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
