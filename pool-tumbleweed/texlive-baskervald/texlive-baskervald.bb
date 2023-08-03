SUMMARY = "Baskervald ADF fonts collection with TeX/LaTeX support"
DESCRIPTION = "Baskervald ADF is a serif family with lining figures designed \
as a substitute for Baskerville. The family currently includes \
upright and italic or oblique shapes in each of regular, bold \
and heavy weights. All fonts include the slashed zero and \
additional non-standard ligatures. The support package renames \
them according to the Karl Berry fontname scheme and defines \
two families. One of these primarily provides access to the \
'standard' or default characters while the other supports \
additional ligatures. The included package files provide access \
to these features in LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.016svn19490"

RPM_NAME = "texlive-baskervald-2023.209.1.016svn19490-54.1.noarch.rpm"
RPM_HASH = "d92d53ec4f72ee96235cd490dc67394fc5fbd298b1243d64100f09c2297ce019769f84ba0a37eb92a776261846c0d533dc5643dded651b04ee6c020a7e5fc359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-baskervald.sty \
tex-supp-ybv.enc \
tex-t1ybv.fd \
tex-t1ybvw.fd \
tex-ts1ybv.fd \
tex-ts1ybvw.fd \
tex-ybv.map \
tex-ybvb8c.tfm \
tex-ybvb8c.vf \
tex-ybvb8r.tfm \
tex-ybvb8s.tfm \
tex-ybvb8t.tfm \
tex-ybvb8t.vf \
tex-ybvbi8c.tfm \
tex-ybvbi8c.vf \
tex-ybvbi8r.tfm \
tex-ybvbi8s.tfm \
tex-ybvbi8t.tfm \
tex-ybvbi8t.vf \
tex-ybvbiw8t.tfm \
tex-ybvbiw8t.vf \
tex-ybvbw8t.tfm \
tex-ybvbw8t.vf \
tex-ybvh8c.tfm \
tex-ybvh8c.vf \
tex-ybvh8r.tfm \
tex-ybvh8s.tfm \
tex-ybvh8t.tfm \
tex-ybvh8t.vf \
tex-ybvho8c.tfm \
tex-ybvho8c.vf \
tex-ybvho8r.tfm \
tex-ybvho8s.tfm \
tex-ybvho8t.tfm \
tex-ybvho8t.vf \
tex-ybvhow8t.tfm \
tex-ybvhow8t.vf \
tex-ybvhw8t.tfm \
tex-ybvhw8t.vf \
tex-ybvr8c.tfm \
tex-ybvr8c.vf \
tex-ybvr8r.tfm \
tex-ybvr8s.tfm \
tex-ybvr8t.tfm \
tex-ybvr8t.vf \
tex-ybvri8c.tfm \
tex-ybvri8c.vf \
tex-ybvri8r.tfm \
tex-ybvri8s.tfm \
tex-ybvri8t.tfm \
tex-ybvri8t.vf \
tex-ybvriw8t.tfm \
tex-ybvriw8t.vf \
tex-ybvrw8t.tfm \
tex-ybvrw8t.vf \
texlive-baskervald"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-nfssext-cfr.sty \
tex-textcomp.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-baskervald-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
