SUMMARY = "Babel support for Irish"
DESCRIPTION = "The package provides the language definition file for support \
of Irish Gaelic in babel. The principal content is translations \
to Irish of standard 'LaTeX names'. (No shortcuts are defined.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0hsvn30277"

RPM_NAME = "texlive-babel-irish-2023.209.1.0hsvn30277-54.1.noarch.rpm"
RPM_HASH = "da644c00d242dd2608c1584231183cdc688e23547e443bbca0918b970225e675e65f5a87df418ae07571ce4832ab0c832f09e96dc63e78ff5f8ff7537c634c18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-irish.ldf \
texlive-babel-irish"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
