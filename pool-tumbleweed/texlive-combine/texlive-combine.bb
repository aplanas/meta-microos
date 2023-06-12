SUMMARY = "Bundle individual documents into a single document"
DESCRIPTION = "The combine class lets you bundle individual documents into a \
single document, such as when preparing a conference \
proceedings. The auxiliary combinet package puts the titles and \
authors from \\maketitle commands into the main document's Table \
of Contents. The package cooperates with the abstract and \
titling packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7asvn19361"

RPM_NAME = "texlive-combine-2023.201.0.0.7asvn19361-53.1.noarch.rpm"
RPM_HASH = "0a46e5c482cb9bdc68614ad73850f67a6755185d0b683acfbd516a83475db3b4520501416c94a0186f204d1750108f9af0de5d604bd37a7c434cadcb6671373d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(combcite.sty) \
tex(combine.cls) \
tex(combinet.sty) \
tex(combnat.sty) \
texlive-combine"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(cite.sty) \
tex(keyval.sty) \
tex(natbib.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
