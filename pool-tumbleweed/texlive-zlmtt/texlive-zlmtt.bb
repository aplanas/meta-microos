SUMMARY = "Use Latin Modern Typewriter fonts"
DESCRIPTION = "The package allows selection of Latin Modern Typewriter fonts \
with scaling and access to all its features."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.032svn64076"

RPM_NAME = "texlive-zlmtt-2023.209.1.032svn64076-53.1.noarch.rpm"
RPM_HASH = "5b2e5d99fb099b57180b7e6fac2c7e1066087a6e7742d3c8488a4ca480a7c2baff8fbac3b8e5a5cdcc5bdb258034099b45bb04f4a5dc8ca5a1f64e82dbc0218b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-il2zlmtt.fd \
tex-il2zlmvtt.fd \
tex-l7xzlmtt.fd \
tex-l7xzlmvtt.fd \
tex-ly1zlmtt.fd \
tex-ly1zlmvtt.fd \
tex-ot1zlmtt.fd \
tex-ot1zlmvtt.fd \
tex-ot4zlmtt.fd \
tex-ot4zlmvtt.fd \
tex-qxzlmtt.fd \
tex-qxzlmvtt.fd \
tex-t1zlmtt.fd \
tex-t1zlmvtt.fd \
tex-t5zlmtt.fd \
tex-t5zlmvtt.fd \
tex-ts1zlmtt.fd \
tex-ts1zlmvtt.fd \
tex-zlmtt.sty \
texlive-zlmtt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-mweights.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
