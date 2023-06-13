SUMMARY = "Simple creation of commands with key-value arguments"
DESCRIPTION = "The package (which requires e-TeX) provides a natural way to \
define commands with optional keys. The package provides \
\\newkeycommand, \\renewkeycommand, \\providekeycommand, \
\\newkeyenvironment and \\renewkeyenvironment, together with \
\\keycmd for a more advanced interface. The package is based on \
kvsetkeys by Heiko Oberdiek."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1415svn18042"

RPM_NAME = "texlive-keycommand-2023.201.3.1415svn18042-55.1.noarch.rpm"
RPM_HASH = "617cf02ff83016781ceb58f582867093f8fd07eccf5a370293ee1b9b624bacf8070f45d957d913707f724a49b22719eff43ddc8ef8e668b6b768282dfc4322e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(keycommand.sty) \
texlive-keycommand"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etex.sty) \
tex(etoolbox.sty) \
tex(kvsetkeys.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
