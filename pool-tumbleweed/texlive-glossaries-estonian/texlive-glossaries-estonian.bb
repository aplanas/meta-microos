SUMMARY = "Estonian language module for glossaries package"
DESCRIPTION = "This package provides the Estonian language module for the \
glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn49928"

RPM_NAME = "texlive-glossaries-estonian-2023.209.1.0svn49928-54.2.noarch.rpm"
RPM_HASH = "a0022918db5e0eef0326a91fdc38ac543c26eca7d6111358ea523b79279c46e641ed05cce1bc56dd79f927d7470380554c5ef2fb1beae9d16baf791f66f581a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-estonian-ascii.ldf \
tex-glossaries-estonian-utf8.ldf \
tex-glossaries-estonian.ldf \
texlive-glossaries-estonian"

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
