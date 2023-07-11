SUMMARY = "Use Latin Modern Typewriter fonts"
DESCRIPTION = "The package allows selection of Latin Modern Typewriter fonts \
with scaling and access to all its features."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.032svn64076"

RPM_NAME = "texlive-zlmtt-2023.201.1.032svn64076-52.2.noarch.rpm"
RPM_HASH = "c1c7ec44cd586fcdc43ae8265cdefdf1ebbc837a6844357900884496f63b15a18312ddc2a2f5b90175bc51125d64c4a22146e86f2ad7d0a709771fc9b7bfd4b7"
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
