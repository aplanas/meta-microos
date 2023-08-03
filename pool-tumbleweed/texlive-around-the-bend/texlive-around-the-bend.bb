SUMMARY = "Typeset exercises in TeX, with answers"
DESCRIPTION = "This is a typeset version of the files of the aro-bend, plus \
three extra questions (with their answers) that Michael Downes \
didn't manage to get onto CTAN."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-around-the-bend-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "08b062b2ae51a99228aa1418f241f02b723ec7be72fc0625ae2be96c824c3314b6f3bc030ded85e225eb3f362442e3252237674bd67e7136440fddb9f3307fc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-around-the-bend"

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
