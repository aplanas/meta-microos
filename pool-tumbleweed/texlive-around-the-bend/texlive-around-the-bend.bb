SUMMARY = "Typeset exercises in TeX, with answers"
DESCRIPTION = "This is a typeset version of the files of the aro-bend, plus \
three extra questions (with their answers) that Michael Downes \
didn't manage to get onto CTAN."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-around-the-bend-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "168f64d4aeb6f7d44f4a0233a8b7118d0eada498ce4f382cfdfc43c943183bce90c405cdf8a5609196dc0575991f9a00620cc3d1876fbab13589f4e0929d701c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-around-the-bend"

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
