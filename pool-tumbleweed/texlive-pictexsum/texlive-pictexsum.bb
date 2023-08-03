SUMMARY = "A summary of PicTeX commands"
DESCRIPTION = "The document summarises the commands of PicTeX. While it is no \
substitute for the PicTeX manual itself (available from \
Personal TeX inc.), the document is a useful aide-memoire for \
those who have read the manual."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn24965"

RPM_NAME = "texlive-pictexsum-2023.209.svn24965-52.1.noarch.rpm"
RPM_HASH = "c07c5051051964fa4a0db7022ceaeb1f5eb921b0db73927f799e265820cc0815bac1e010bd7cd2ec6eb2087a996f224b03784632bfc8afa3429f8378e0ca6697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pictexsum"

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
