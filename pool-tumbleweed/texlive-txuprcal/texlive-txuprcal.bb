SUMMARY = "Upright calligraphic font based on TX calligraphic"
DESCRIPTION = "This small package provides a means of loading as \\mathcal an \
uprighted version of the calligraphic fonts from the TX font \
package. A scaled option to provided to allow arbitrary \
scaling."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.00svn43327"

RPM_NAME = "texlive-txuprcal-2023.209.1.00svn43327-53.1.noarch.rpm"
RPM_HASH = "1ae38d80c162d724ea5984523edd848f2331c83e784f025cddd70f2eb3e48e53ef8282030dd3a787ec97bf68a9eb0018920be3633091d13056341470c87316cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-TXUprCal.map \
tex-txUprCal-Bold.tfm \
tex-txUprCal-Regular.tfm \
tex-txuprcal.sty \
tex-utxuprcal.fd \
texlive-txuprcal"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-txuprcal-fonts"

inherit rpm
