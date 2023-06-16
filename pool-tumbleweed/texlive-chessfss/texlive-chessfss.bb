SUMMARY = "A package to handle chess fonts"
DESCRIPTION = "This package offers commands to use and switch between chess \
fonts. It uses the LaTeX font selection scheme (nfss). The \
package doesn't parse, format and print PGN input like e.g. the \
packages skak or texmate; the aim of the package is to offer \
writers of chess packages a bundle of commands for fonts, so \
that they don't have to implement all these commands for \
themselves. A normal user can use the package to print e.g. \
single chess symbols and simple diagrams. The documentation \
contains also a section about installation of chess fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn19440"

RPM_NAME = "texlive-chessfss-2023.201.1.2asvn19440-53.1.noarch.rpm"
RPM_HASH = "136a1e1fdc7e74b0fa269572a71194814a0adb416a2644dca1e0badc7fc567d189d8b583498e97ada3f400807984f9781359aa28fb1efb62bb12849f5ea97752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chess-board-example-enc.enc \
tex-chess-fig-example-enc.enc \
tex-chessfss.sty \
tex-lsb1enc.def \
tex-lsb1skak.fd \
tex-lsb1skaknew.fd \
tex-lsb2enc.def \
tex-lsb2skak.fd \
tex-lsb2skaknew.fd \
tex-lsb3enc.def \
tex-lsb3skak.fd \
tex-lsb3skaknew.fd \
tex-lsbc1enc.def \
tex-lsbc1skaknew.fd \
tex-lsbc2enc.def \
tex-lsbc2skaknew.fd \
tex-lsbc3enc.def \
tex-lsbc3skaknew.fd \
tex-lsbc4enc.def \
tex-lsbc4skaknew.fd \
tex-lsbc5enc.def \
tex-lsbc5skaknew.fd \
tex-lsbenc.def \
tex-lsbskak.fd \
tex-lsbskaknew.fd \
tex-lsfenc.def \
tex-lsfskak.fd \
tex-lsfskaknew.fd \
tex-lsienc.def \
tex-lsiskak.fd \
tex-lsiskaknew.fd \
texlive-chessfss"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
