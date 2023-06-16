SUMMARY = "URW 'Base 35' font pack for LaTeX"
DESCRIPTION = "A set of fonts for use as 'drop-in' replacements for Adobe's \
basic set, comprising: Century Schoolbook (substituting for \
Adobe's New Century Schoolbook); Dingbats (substituting for \
Adobe's Zapf Dingbats); Nimbus Mono L (substituting for Abobe's \
Courier); Nimbus Roman No9 L (substituting for Adobe's Times); \
Nimbus Sans L (substituting for Adobe's Helvetica); Standard \
Symbols L (substituting for Adobe's Symbol); URW Bookman; URW \
Chancery L Medium Italic (substituting for Adobe's Zapf \
Chancery); URW Gothic L Book (substituting for Adobe's Avant \
Garde); and URW Palladio L (substituting for Adobe's Palatino)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn61719"

RPM_NAME = "texlive-ncntrsbk-2023.201.svn61719-54.1.noarch.rpm"
RPM_HASH = "90a329dfe9d56755c3f2483eed4400f405e7aea98b48468c557513cb68a3553d92758a466943e2410d72c92679bf94dfddabefe292d54f27f4fad1582a82cba3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-8runc.fd \
tex-omlunc.fd \
tex-omsunc.fd \
tex-ot1unc.fd \
tex-pncb.tfm \
tex-pncb.vf \
tex-pncb7t.tfm \
tex-pncb7t.vf \
tex-pncb8c.tfm \
tex-pncb8c.vf \
tex-pncb8r.tfm \
tex-pncb8t.tfm \
tex-pncb8t.vf \
tex-pncbc.tfm \
tex-pncbc.vf \
tex-pncbc7t.tfm \
tex-pncbc7t.vf \
tex-pncbc8t.tfm \
tex-pncbc8t.vf \
tex-pncbi.tfm \
tex-pncbi.vf \
tex-pncbi7t.tfm \
tex-pncbi7t.vf \
tex-pncbi8c.tfm \
tex-pncbi8c.vf \
tex-pncbi8r.tfm \
tex-pncbi8t.tfm \
tex-pncbi8t.vf \
tex-pncbo.tfm \
tex-pncbo.vf \
tex-pncbo7t.tfm \
tex-pncbo7t.vf \
tex-pncbo8c.tfm \
tex-pncbo8c.vf \
tex-pncbo8r.tfm \
tex-pncbo8t.tfm \
tex-pncbo8t.vf \
tex-pncr.tfm \
tex-pncr.vf \
tex-pncr7t.tfm \
tex-pncr7t.vf \
tex-pncr8c.tfm \
tex-pncr8c.vf \
tex-pncr8r.tfm \
tex-pncr8t.tfm \
tex-pncr8t.vf \
tex-pncrc.tfm \
tex-pncrc.vf \
tex-pncrc7t.tfm \
tex-pncrc7t.vf \
tex-pncrc8t.tfm \
tex-pncrc8t.vf \
tex-pncri.tfm \
tex-pncri.vf \
tex-pncri7t.tfm \
tex-pncri7t.vf \
tex-pncri8c.tfm \
tex-pncri8c.vf \
tex-pncri8r.tfm \
tex-pncri8t.tfm \
tex-pncri8t.vf \
tex-pncro.tfm \
tex-pncro.vf \
tex-pncro7t.tfm \
tex-pncro7t.vf \
tex-pncro8c.tfm \
tex-pncro8c.vf \
tex-pncro8r.tfm \
tex-pncro8t.tfm \
tex-pncro8t.vf \
tex-t1unc.fd \
tex-ts1unc.fd \
tex-unc.map \
tex-uncb7t.tfm \
tex-uncb7t.vf \
tex-uncb8c.tfm \
tex-uncb8c.vf \
tex-uncb8r.tfm \
tex-uncb8t.tfm \
tex-uncb8t.vf \
tex-uncbc7t.tfm \
tex-uncbc7t.vf \
tex-uncbc8t.tfm \
tex-uncbc8t.vf \
tex-uncbi7t.tfm \
tex-uncbi7t.vf \
tex-uncbi8c.tfm \
tex-uncbi8c.vf \
tex-uncbi8r.tfm \
tex-uncbi8t.tfm \
tex-uncbi8t.vf \
tex-uncbo7t.tfm \
tex-uncbo7t.vf \
tex-uncbo8c.tfm \
tex-uncbo8c.vf \
tex-uncbo8r.tfm \
tex-uncbo8t.tfm \
tex-uncbo8t.vf \
tex-uncr7t.tfm \
tex-uncr7t.vf \
tex-uncr8c.tfm \
tex-uncr8c.vf \
tex-uncr8r.tfm \
tex-uncr8t.tfm \
tex-uncr8t.vf \
tex-uncrc7t.tfm \
tex-uncrc7t.vf \
tex-uncrc8t.tfm \
tex-uncrc8t.vf \
tex-uncri7t.tfm \
tex-uncri7t.vf \
tex-uncri8c.tfm \
tex-uncri8c.vf \
tex-uncri8r.tfm \
tex-uncri8t.tfm \
tex-uncri8t.vf \
tex-uncro7t.tfm \
tex-uncro7t.vf \
tex-uncro8c.tfm \
tex-uncro8c.vf \
tex-uncro8r.tfm \
tex-uncro8t.tfm \
tex-uncro8t.vf \
texlive-ncntrsbk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-ncntrsbk-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
