SUMMARY = "Use Latin Modern Typewriter fonts"
DESCRIPTION = "The package allows selection of Latin Modern Typewriter fonts \
with scaling and access to all its features."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.032svn64076"

RPM_NAME = "texlive-zlmtt-2023.209.1.032svn64076-53.2.noarch.rpm"
RPM_HASH = "1b1b5e931cc0ee043f472dab86d679f5a4b194cc2c23e2e4628f5c97e124dc1dd3c5ede1294f764796f33cfa13688dcea14b2e9cd07c92fd1bfedd50469dcb92"
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
