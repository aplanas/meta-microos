SUMMARY = "Gender neutrality for languages with grammatical gender"
DESCRIPTION = "Many languages -- like German or French -- use masculine and \
feminine grammatical genders. There are many ideas how to \
promote gender neutrality in those languages. The gender \
package uses alternately masculine and feminine forms. It is \
also possible to use just one form out of a template."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn36464"

RPM_NAME = "texlive-gender-2023.209.1.0svn36464-53.1.noarch.rpm"
RPM_HASH = "397121651a5e3ac05be3f589df2a8eb794d870361857af0f5299acde42c2b60a4cf63a1857e0a1253a7df64e14c0aaa1c597253aebc3e879069702be3740eceb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gender.sty \
texlive-gender"

RDEPENDS:${PN} += "/usr/bin/sh \
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
