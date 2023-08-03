SUMMARY = "Bundle individual documents into a single document"
DESCRIPTION = "The combine class lets you bundle individual documents into a \
single document, such as when preparing a conference \
proceedings. The auxiliary combinet package puts the titles and \
authors from \\maketitle commands into the main document's Table \
of Contents. The package cooperates with the abstract and \
titling packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7asvn19361"

RPM_NAME = "texlive-combine-2023.209.0.0.7asvn19361-54.1.noarch.rpm"
RPM_HASH = "2eacbdd889b7484d90ac26a32d8235185dbe47139e4fecbc761d59074a842e0f3d77334481bc533bf9026ae94658f6c747cf8456fb18daac494a2ffcb827876f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-combcite.sty \
tex-combine.cls \
tex-combinet.sty \
tex-combnat.sty \
texlive-combine"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cite.sty \
tex-keyval.sty \
tex-natbib.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
