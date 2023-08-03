SUMMARY = "A compilation genealogy font"
DESCRIPTION = "A simple compilation of the genealogical symbols found in the \
wasy and gen fonts, adding the male and female symbols to \
Knuth's 'gen' font, and so avoiding loading two fonts when you \
need only genealogical symbols. The font is distributed as \
Metafont source."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn25112"

RPM_NAME = "texlive-genealogy-2023.209.svn25112-53.1.noarch.rpm"
RPM_HASH = "097f9b3334bf11a5e1e00680e895c5c3e66cf9b413e35daf91152299aebec9db7416698028c227750e85e16f5f6ad800b93d27f5dec380f03bbb4348ea39a9e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-drgen10.tfm \
texlive-genealogy"

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
