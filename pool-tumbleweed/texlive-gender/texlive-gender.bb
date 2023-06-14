SUMMARY = "Gender neutrality for languages with grammatical gender"
DESCRIPTION = "Many languages -- like German or French -- use masculine and \
feminine grammatical genders. There are many ideas how to \
promote gender neutrality in those languages. The gender \
package uses alternately masculine and feminine forms. It is \
also possible to use just one form out of a template."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn36464"

RPM_NAME = "texlive-gender-2023.201.1.0svn36464-52.1.noarch.rpm"
RPM_HASH = "915f19350b6316fb78318c925df85c6bed5fea604db8a05b0627e93722086e63ba208ef4e9d2a28e4cebf81b9e7431698423f1c878e6f001bc77212933e04cdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gender.sty \
texlive-gender"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
