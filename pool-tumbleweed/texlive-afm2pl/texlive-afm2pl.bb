SUMMARY = "Convert AFM to TeX property list (.pl) metrics"
DESCRIPTION = "Program home page: http://tex.aanhet.net/afm2pl/"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-afm2pl-2023.209.svn66186-55.1.noarch.rpm"
RPM_HASH = "bb7a228d1957f7d755a7a8b4030293242f85da844712b3edadc40acc71172ee257820b9e646811739b5b12bf087091fde680cec006e64d1876955c5ca7630f22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-afm2pl-ot1.enc \
tex-afm2pl-ot1ital.enc \
tex-afm2pl-ot1tt.enc \
tex-afm2pl-texnanlc.enc \
tex-afm2pl-texnanuc.enc \
tex-makesc8y.tex \
texlive-afm2pl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-afm2pl-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
