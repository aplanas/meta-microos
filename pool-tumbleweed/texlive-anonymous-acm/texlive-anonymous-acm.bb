SUMMARY = "Typeset anonymous versions for ACM articles"
DESCRIPTION = "Academics often need to submit anonymous versions of their \
papers for peer-review. This often requires anonymization which \
at some future date needs to be reversed. However \
de-anonymizing an anonymized paper can be laborious and \
error-prone. This LaTeX package allows anonymization options to \
be specified at the time of writing for authors using \
acmart.cls, the official Association of Computing Machinery \
(ACM) master article template. Anonymization or deanonymization \
is carried out by simply changing one option and recompiling."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn55121"

RPM_NAME = "texlive-anonymous-acm-2023.201.1.0svn55121-54.1.noarch.rpm"
RPM_HASH = "b5a1b4f32d30f25be77a592e58de050858e324ba60d7ece5804c8e70ad3668dbf001113c1b3e5196221c2369141319833851272021141dcf61e4e1670929ac45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-anonymous-acm.sty \
texlive-anonymous-acm"

RDEPENDS:${PN} += "/bin/sh \
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
