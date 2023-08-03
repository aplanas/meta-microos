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

PV = "2023.209.1.0svn55121"

RPM_NAME = "texlive-anonymous-acm-2023.209.1.0svn55121-55.1.noarch.rpm"
RPM_HASH = "1c481aa03ea8ebcfd167b4ddc19fb3437411c1af68f8799aa1a916c164906b68b92abfe65283b7663786eade3b62862ba3ff44827bcf36c03d3e1fd61c19e155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-anonymous-acm.sty \
texlive-anonymous-acm"

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
