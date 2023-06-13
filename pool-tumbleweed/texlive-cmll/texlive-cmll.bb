SUMMARY = "Symbols for linear logic"
DESCRIPTION = "This is a very small font set that contain some symbols useful \
in linear logic, which are apparently not available elsewhere. \
Variants are included for use with Computer Modern serif and \
sans-serif and with the AMS Euler series. The font is provided \
both as Metafont source, and in Adobe Type 1 format. LaTeX \
support is provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17964"

RPM_NAME = "texlive-cmll-2023.201.svn17964-53.1.noarch.rpm"
RPM_HASH = "df1c2e0fdd851b364c88404ddd25497867dbbe227a2f5642774cbdaab66290a297341ecd9ccacdd9f10e53b01cf37208eb1d8b60406f8940a527ab95881c03a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cmll.map) \
tex(cmll.sty) \
tex(cmllbx10.tfm) \
tex(cmllbx12.tfm) \
tex(cmllbx5.tfm) \
tex(cmllbx6.tfm) \
tex(cmllbx7.tfm) \
tex(cmllbx8.tfm) \
tex(cmllbx9.tfm) \
tex(cmllr10.tfm) \
tex(cmllr12.tfm) \
tex(cmllr17.tfm) \
tex(cmllr5.tfm) \
tex(cmllr6.tfm) \
tex(cmllr7.tfm) \
tex(cmllr8.tfm) \
tex(cmllr9.tfm) \
tex(cmllss10.tfm) \
tex(cmllss12.tfm) \
tex(cmllss17.tfm) \
tex(cmllss8.tfm) \
tex(cmllss9.tfm) \
tex(cmllssbx10.tfm) \
tex(eullbx10.tfm) \
tex(eullbx5.tfm) \
tex(eullbx6.tfm) \
tex(eullbx7.tfm) \
tex(eullbx8.tfm) \
tex(eullbx9.tfm) \
tex(eullr10.tfm) \
tex(eullr5.tfm) \
tex(eullr6.tfm) \
tex(eullr7.tfm) \
tex(eullr8.tfm) \
tex(eullr9.tfm) \
tex(ucmllr.fd) \
tex(ucmllss.fd) \
tex(ueull.fd) \
texlive-cmll"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(graphicx.sty) \
tex(ifthen.sty) \
tex(relsize.sty) \
tex(updmap.cfg) \
texlive \
texlive-cmll-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
