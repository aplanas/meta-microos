SUMMARY = "Enable arrows showing diphthongs on vowel charts"
DESCRIPTION = "The package extends the vowel package (distributed as part of \
the tipa bundle) by allowing the user to draw arrows between \
vowels to show relationships such as diphthong membership. The \
package depends on use of pstricks."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn25228"

RPM_NAME = "texlive-pst-vowel-2023.209.1.0svn25228-54.1.noarch.rpm"
RPM_HASH = "b5a6ad469d95c570f7594f23db4089999c6904cb2648d2acc7b39f606e03f3ac9438b73595f4120dbfb73275c3595605cefed0b1b66b7850c470019408b60f24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-vowel.sty \
texlive-pst-vowel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-node.sty \
tex-vowel.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
