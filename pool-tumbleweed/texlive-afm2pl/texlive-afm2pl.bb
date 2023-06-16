SUMMARY = "Convert AFM to TeX property list (.pl) metrics"
DESCRIPTION = "Program home page: http://tex.aanhet.net/afm2pl/"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-afm2pl-2023.201.svn66186-54.1.noarch.rpm"
RPM_HASH = "a3a1096dcf309cd714ce0cd9ad2977c52ddbd5b3e3442bd97a86afa5636f58faf2d2bb6d20c4c076aa0993761c78857d17fcfbace6163e655802edbdf51ded26"
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
