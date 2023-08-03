SUMMARY = "Provides a scaled Courier font"
DESCRIPTION = "This package sets the default typewriter font to Courier with a \
possible scale factor (in the same way as the helvet package \
for Helvetica works for sans serif)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn24940"

RPM_NAME = "texlive-courier-scaled-2023.209.svn24940-55.1.noarch.rpm"
RPM_HASH = "d14ef0aeb50e99f24148d83e3c2116e4d57f2dbf2cbd039671bab9fb2f4ee07ac5504a2a4461f82dc2681c8858911ecb034ab91e1960462a8dbfa6e42c1fac57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-8rpcrs.fd \
tex-couriers.sty \
tex-il2pcrs.fd \
tex-ly1pcrs.fd \
tex-omlpcrs.fd \
tex-omspcrs.fd \
tex-ot1pcrs.fd \
tex-t1pcrs.fd \
tex-t5pcrs.fd \
tex-ts1pcrs.fd \
tex-xl2pcrs.fd \
texlive-courier-scaled"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
