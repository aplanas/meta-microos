SUMMARY = "Knuth's local information"
DESCRIPTION = "A collection of experimental programs and developments based \
on, or complementary to, the matter in his distribution \
directories."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn57963"

RPM_NAME = "texlive-knuth-local-2023.209.svn57963-56.1.noarch.rpm"
RPM_HASH = "27b3c210c0b8760aa27dd8c18a39ef3bcc5f43f6e39e2131e13f748549cc966f2849217fb8f27ed775389e6b2c0444d351d3e2a021f662708ae17597dea4cbab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-domino.tfm \
tex-logod10.tfm \
tex-logosl9.tfm \
tex-random.tfm \
tex-snfont.tfm \
tex-xepsf.tex \
texlive-knuth-local"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
