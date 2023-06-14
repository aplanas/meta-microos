SUMMARY = "OpenType Unicode maths fonts"
DESCRIPTION = "The STIX fonts are a suite of unicode OpenType fonts containing \
a complete set of mathematical glyphs. As of April 2018 this \
package is considered obsolete. See stix2-otf and stix2-type1 \
instead."
LICENSE = "OFL-1.1"

PV = "2023.201.1.1.3svn54512"

RPM_NAME = "texlive-stix-2023.201.1.1.3svn54512-57.1.noarch.rpm"
RPM_HASH = "9b21f28d3e2fb5603db1034d5ecdf80541e97241edcc9ea72b1238cd2f05da2065e9c8ea848d08e2bcd14b98f2f54157708ca08d780aaf33b59971352f752e20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ls1stix.fd \
tex-ls1stixbb.fd \
tex-ls1stixfrak.fd \
tex-ls1stixscr.fd \
tex-ls1stixsf.fd \
tex-ls2stix.fd \
tex-ls2stixcal.fd \
tex-ls2stixex.fd \
tex-ls2stixtt.fd \
tex-ot1-stixgeneral-bold.tfm \
tex-ot1-stixgeneral-bolditalic.tfm \
tex-ot1-stixgeneral-italic.tfm \
tex-ot1-stixgeneral.tfm \
tex-ot1-stixgeneralsc-bold.tfm \
tex-ot1-stixgeneralsc-bold.vf \
tex-ot1-stixgeneralsc.tfm \
tex-ot1-stixgeneralsc.vf \
tex-ot1stix.fd \
tex-ot2-stixgeneral-bold.tfm \
tex-ot2-stixgeneral-bolditalic.tfm \
tex-ot2-stixgeneral-italic.tfm \
tex-ot2-stixgeneral.tfm \
tex-ot2-stixgeneralsc-bold.tfm \
tex-ot2-stixgeneralsc-bold.vf \
tex-ot2-stixgeneralsc.tfm \
tex-ot2-stixgeneralsc.vf \
tex-ot2stix.fd \
tex-stix-extra1.enc \
tex-stix-extra1.tfm \
tex-stix-extra2.enc \
tex-stix-extra2.tfm \
tex-stix-extra3.enc \
tex-stix-extra3.tfm \
tex-stix-mathbb-bold.tfm \
tex-stix-mathbb.tfm \
tex-stix-mathbbit-bold.tfm \
tex-stix-mathbbit.tfm \
tex-stix-mathcal-bold.tfm \
tex-stix-mathcal.tfm \
tex-stix-mathex-bold.tfm \
tex-stix-mathex.tfm \
tex-stix-mathfrak-bold.tfm \
tex-stix-mathfrak.tfm \
tex-stix-mathit-bold.tfm \
tex-stix-mathit.tfm \
tex-stix-mathrm-bold.tfm \
tex-stix-mathrm.tfm \
tex-stix-mathscr-bold.tfm \
tex-stix-mathscr.tfm \
tex-stix-mathsf-bold.tfm \
tex-stix-mathsf.tfm \
tex-stix-mathsfit-bold.tfm \
tex-stix-mathsfit.tfm \
tex-stix-mathtt-bold.tfm \
tex-stix-mathtt.tfm \
tex-stix-ot1.enc \
tex-stix-ot2.enc \
tex-stix-t1.enc \
tex-stix-ts1.enc \
tex-stix.map \
tex-stix.sty \
tex-t1-stixgeneral-bold.tfm \
tex-t1-stixgeneral-bolditalic.tfm \
tex-t1-stixgeneral-italic.tfm \
tex-t1-stixgeneral.tfm \
tex-t1-stixgeneralsc-bold.tfm \
tex-t1-stixgeneralsc-bold.vf \
tex-t1-stixgeneralsc.tfm \
tex-t1-stixgeneralsc.vf \
tex-t1stix.fd \
tex-ts1-stixgeneral-bold.tfm \
tex-ts1-stixgeneral-bolditalic.tfm \
tex-ts1-stixgeneral-italic.tfm \
tex-ts1-stixgeneral.tfm \
tex-ts1stix.fd \
texlive-stix"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-textcomp.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-stix-fonts"

inherit rpm
