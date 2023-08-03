SUMMARY = "Place contents into a full width colour strip"
DESCRIPTION = "This lightweight package provides the colorstrip environment, \
that places its contents into a full page width colour strip."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn60363"

RPM_NAME = "texlive-clrstrip-2023.209.svn60363-54.1.noarch.rpm"
RPM_HASH = "45d1d2117c7161f8b4b2c1c9b9e074fd9dfa1cd2dabf4169cf74a7b0a83b99f1f421908af22f232c0a028a3cfc3cb9a503a9ea2a13766453fd8e05d60ecbf5a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clrstrip.sty \
texlive-clrstrip"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expkv.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
