SUMMARY = "Mark research contributions in scientific documents and embed them in PDF metadata"
DESCRIPTION = "Scientific Knowledge Graph TeX (SciKgTeX) is a LuaLaTeX package \
which makes it possible to annotate specific research \
contributions in scientific documents. SciKGTeX will enrich the \
document by adding the marked contributions to PDF metadata in \
a structured XMP format which can be picked up by search \
engines and knowledge graphs."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.1svn65256"

RPM_NAME = "texlive-scikgtex-2023.209.2.1.1svn65256-54.1.noarch.rpm"
RPM_HASH = "f26258d07dbd11ff8a792378aae1d141ae369751d5a57718a9677a8b1499f1946c5dcddd661632108dff42cf3f8ef07d72a36c2c871f1f93240cd6df83b3855a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scikgtex.sty \
texlive-scikgtex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-suffix.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
