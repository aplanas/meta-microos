SUMMARY = "Enable arrows showing diphthongs on vowel charts"
DESCRIPTION = "The package extends the vowel package (distributed as part of \
the tipa bundle) by allowing the user to draw arrows between \
vowels to show relationships such as diphthong membership. The \
package depends on use of pstricks."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn25228"

RPM_NAME = "texlive-pst-vowel-2023.209.1.0svn25228-54.2.noarch.rpm"
RPM_HASH = "c8dffc4b3e105babb5d0147e2c3581615c74e7714a46693a8918fc7f870490cd8f3e4c5c03b614836700fcaefe02f66bb6102dd7d92132a05cb458d672f62f12"
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
