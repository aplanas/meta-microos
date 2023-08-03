SUMMARY = "Finnish language module for the datetime2 package"
DESCRIPTION = "This module provides the 'finnish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn47047"

RPM_NAME = "texlive-datetime2-finnish-2023.209.1.2svn47047-53.1.noarch.rpm"
RPM_HASH = "f600df7e937409655453e6cab90e4e1a587ce0f46f48465d9e68705286002819d0a82a19cb6183b85b895ab7a9448bde397f595870486ac9ebea38a9f7f246de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-finnish-ascii.ldf \
tex-datetime2-finnish-utf8.ldf \
tex-datetime2-finnish.ldf \
texlive-datetime2-finnish"

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
