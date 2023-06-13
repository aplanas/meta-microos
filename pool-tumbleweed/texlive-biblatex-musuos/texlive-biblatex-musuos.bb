SUMMARY = "A BibLaTeX style for citations in musuos.cls"
DESCRIPTION = "The style is designed for use with the musuos class, but it \
should be usable with other classes, too."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn24097"

RPM_NAME = "texlive-biblatex-musuos-2023.201.1.0svn24097-53.1.noarch.rpm"
RPM_HASH = "ffc4a0a3832e5577e20bc2526d8b072d823526937980a79e52a6fd0022d48fe4f0a55ce4b53f5246a8699b26689b866451732cf1bb506c144c9b143d89beaa98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(german-musuos.lbx) \
tex(musuos.bbx) \
tex(musuos.cbx) \
texlive-biblatex-musuos"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(authortitle.bbx) \
tex(verbose-ibid.cbx) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
