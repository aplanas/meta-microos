SUMMARY = "A firework display in obfuscated TeX"
DESCRIPTION = "The output PDF file gives an amusing display, as the reader \
pages through it."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.20120102svn25020"

RPM_NAME = "texlive-happy4th-2023.209.20120102svn25020-54.1.noarch.rpm"
RPM_HASH = "76fdc44f9902488881715b655d45d1e921546408280369f5a0a36c1447fc71ab63ec6076baf91cff23700294365465a9badf77b4239a38962ab347165b51bfd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-happy4th"

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
