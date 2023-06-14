SUMMARY = "Babel support for Norwegian"
DESCRIPTION = "The package provides the language definition file for support \
of Norwegian in babel. Some shortcuts are defined, as well as \
translations to Norsk of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0isvn65093"

RPM_NAME = "texlive-babel-norsk-2023.201.2.0isvn65093-53.1.noarch.rpm"
RPM_HASH = "eb5c735412924fd8265b1c979e1f6ce0a2b43c7b2b5880d117ec329d0da13a884d22b9f443f3526736493dcd0519c5a378442bbc02953a286637d34c1525d403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-norsk.ldf \
texlive-babel-norsk"

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
