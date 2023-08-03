SUMMARY = "A companion package for the Swiss typesetter"
DESCRIPTION = "The package simplifies the preparation of Swiss documents and \
letters by setting up linguistic and common packages. While it \
is a useful addition to the chletter document class, it is not \
tied to it and may be used as a general purpose package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn27118"

RPM_NAME = "texlive-chextras-2023.209.1.01svn27118-54.1.noarch.rpm"
RPM_HASH = "2182b014802b8f712c5ec3fca5db77a8ddb0bb19dc86bedab10c6ca2bca3eedbb5bd4fe66fcf690b8901e8d2963667e0406c053a0400a113e1f35fe286bcf23d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chextras.sty \
tex-eu1lmros.fd \
tex-eu1lmssos.fd \
tex-eu1lmttos.fd \
tex-eu1lmvttos.fd \
tex-t1lmros.fd \
tex-t1lmssos.fd \
tex-t1lmttos.fd \
tex-t1lmvttos.fd \
texlive-chextras"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-etoolbox.sty \
tex-fixltx2e.sty \
tex-fontenc.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-lmodern.sty \
tex-luainputenc.sty \
tex-makecmds.sty \
tex-xkeyval.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
