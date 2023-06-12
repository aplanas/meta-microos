SUMMARY = "Upright calligraphic font based on TX calligraphic"
DESCRIPTION = "This small package provides a means of loading as \\mathcal an \
uprighted version of the calligraphic fonts from the TX font \
package. A scaled option to provided to allow arbitrary \
scaling."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.00svn43327"

RPM_NAME = "texlive-txuprcal-2023.201.1.00svn43327-52.1.noarch.rpm"
RPM_HASH = "909a0d4cdb479cf851cbfc55117d7de138d13010adda6900376742f1f44686822ac7830899f6cce6410cc9637c5123a0a939e661c1b25dd32248b0f35fec3133"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(TXUprCal.map) \
tex(txUprCal-Bold.tfm) \
tex(txUprCal-Regular.tfm) \
tex(txuprcal.sty) \
tex(utxuprcal.fd) \
texlive-txuprcal"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-txuprcal-fonts"

inherit rpm
