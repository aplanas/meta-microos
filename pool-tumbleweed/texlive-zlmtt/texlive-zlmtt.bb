SUMMARY = "Use Latin Modern Typewriter fonts"
DESCRIPTION = "The package allows selection of Latin Modern Typewriter fonts \
with scaling and access to all its features."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.032svn64076"

RPM_NAME = "texlive-zlmtt-2023.201.1.032svn64076-52.1.noarch.rpm"
RPM_HASH = "5d9ee5494bdd1109be533599f4c4866c6d545fa504fe5120c9d1ce08f3e8deeedcab48ee531a89ea329ccf104dead6c61cc77c64e7aba7f70dbdf0fc14cde770"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(il2zlmtt.fd) \
tex(il2zlmvtt.fd) \
tex(l7xzlmtt.fd) \
tex(l7xzlmvtt.fd) \
tex(ly1zlmtt.fd) \
tex(ly1zlmvtt.fd) \
tex(ot1zlmtt.fd) \
tex(ot1zlmvtt.fd) \
tex(ot4zlmtt.fd) \
tex(ot4zlmvtt.fd) \
tex(qxzlmtt.fd) \
tex(qxzlmvtt.fd) \
tex(t1zlmtt.fd) \
tex(t1zlmvtt.fd) \
tex(t5zlmtt.fd) \
tex(t5zlmvtt.fd) \
tex(ts1zlmtt.fd) \
tex(ts1zlmvtt.fd) \
tex(zlmtt.sty) \
texlive-zlmtt"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(mweights.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
