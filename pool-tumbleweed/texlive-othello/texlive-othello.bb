SUMMARY = "Modification of a Go package to create othello boards"
DESCRIPTION = "A package (based on Kolodziejska's go), and fonts (as Metafont \
source) are provided."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-othello-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "8d5d4532fbaea015eaa46b43337bf86f967b769e497c8a5229ce7db311e23d299874e60887a0ac5297bd2c1b04e4fa24d8dd75b61075af1e79f8883a87f09e51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ot10.tfm) \
tex(ot15.tfm) \
tex(ot1bla10.tfm) \
tex(ot1bla15.tfm) \
tex(ot1bla20.tfm) \
tex(ot1neu10.tfm) \
tex(ot1neu15.tfm) \
tex(ot1neu20.tfm) \
tex(ot1whi10.tfm) \
tex(ot1whi15.tfm) \
tex(ot1whi20.tfm) \
tex(othello.sty) \
texlive-othello"

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
