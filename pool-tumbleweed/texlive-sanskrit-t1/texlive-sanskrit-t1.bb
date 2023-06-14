SUMMARY = "Type 1 version of 'skt' fonts for Sanskrit"
DESCRIPTION = "The sanskrit-t1 font package provides Type 1 version of Charles \
Wikner's skt font series for the Sanskrit language."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn55475"

RPM_NAME = "texlive-sanskrit-t1-2023.201.svn55475-53.1.noarch.rpm"
RPM_HASH = "8e00fb278254b28c160710bfac399aecbf1fa26080cce18c3b38ae0f8612b05dde550e8f0022d4768b785b8507b207e21198a803cc7dd2c9a35338caed1e4622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-skt.map \
texlive-sanskrit-t1"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-sanskrit-t1-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
