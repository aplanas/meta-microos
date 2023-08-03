SUMMARY = "Section numbers with trailing dots"
DESCRIPTION = "Makes the numbers of \\section commands come out with a trailing \
dot. Includes a command whereby the same can be made to happen \
with other sectioning commands."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn20208"

RPM_NAME = "texlive-secdot-2023.209.1.0svn20208-54.1.noarch.rpm"
RPM_HASH = "09e8178e989fafb45d7a24d36d8872dc55c2048b120ffed3848e6a55e545c31fab46942e69361e20d41f1fcf443dd11558c52c10909ccd8ea58e240b7f2579b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-secdot.sty \
texlive-secdot"

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
