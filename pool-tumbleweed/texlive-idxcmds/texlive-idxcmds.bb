SUMMARY = "Semantic commands for adding formatted index entries"
DESCRIPTION = "The package provides commands for adding formatted index \
entries; it arises from the author's work on large documents."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2csvn54554"

RPM_NAME = "texlive-idxcmds-2023.209.0.0.2csvn54554-54.1.noarch.rpm"
RPM_HASH = "0b64fceba96fc5bb8198dcc073ad1dba526a71f4ba1112bedc608861e6062d07aca11b02f615fe8ae034648ad9610cbbd808079d8330a97539e8f09cd0fb942c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-idxcmds.sty \
texlive-idxcmds"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-ltxcmds.sty \
tex-pgfopts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
