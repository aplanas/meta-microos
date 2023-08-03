SUMMARY = "Print lengths using specified units"
DESCRIPTION = "\\printlength{length} prints the value of a LaTeX length in the \
units specified by \\uselengthunit{unit} ('unit' may be any TeX \
length unit except for scaled point, viz., any of: pt, pc, in, \
mm, cm, bp, dd or cc). When the unit is pt, the printed length \
value will include any stretch or shrink; otherwise these are \
not printed. The 'unit' argument may also be PT, in which case \
length values will be printed in point units but without any \
stretch or shrink values."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn19847"

RPM_NAME = "texlive-printlen-2023.209.1.1asvn19847-53.1.noarch.rpm"
RPM_HASH = "6359b896a255f0ac83ad5dfced70616da3be5f7fa5641246c4415ecf56e9452a991a8e1f2c01b7e1ca2885907796716dbbd67e5b7f6ee9ac629b379d5f7bc070"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-printlen.sty \
texlive-printlen"

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
