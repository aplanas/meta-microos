SUMMARY = "Enable arrows showing diphthongs on vowel charts"
DESCRIPTION = "The package extends the vowel package (distributed as part of \
the tipa bundle) by allowing the user to draw arrows between \
vowels to show relationships such as diphthong membership. The \
package depends on use of pstricks."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn25228"

RPM_NAME = "texlive-pst-vowel-2023.201.1.0svn25228-53.2.noarch.rpm"
RPM_HASH = "c7763a3b1bd094b1dba244a427450dcb3ce54ea5d1fa9b7d3822e1accfcc19bcb0e6696c12dceaa3169c64a1f2a0b4742fb06e8d2f207fad10c9c17c51386a0c"
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
