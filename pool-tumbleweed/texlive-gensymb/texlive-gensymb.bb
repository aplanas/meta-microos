SUMMARY = "Generic symbols for both text and math mode"
DESCRIPTION = "Provides generic commands \\degree, \\celsius, \\perthousand, \
\\micro and \\ohm which work both in text and maths mode. Various \
means are provided to fake the symbols or take them from \
particular symbol fonts, if they are not available in the \
default fonts used in the document. This should be perfectly \
transparent at user level, so that one can apply the same \
notation for units of measurement in text and math mode and \
with arbitrary typefaces. Note that the package has been \
designed to work in conjunction with units.sty. This package \
used to be part of the was bundle, but has now become a package \
in its own right."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn64740"

RPM_NAME = "texlive-gensymb-2023.209.1.0.2svn64740-53.1.noarch.rpm"
RPM_HASH = "11f921a7bc5e71faba563ed436d46c4a5256aadcf69ff4a57c207f74bebd8ff372a45f2df0e52e3d6db800a9a4bc0e781d6b079a6d1cf64db0aeb1726b9676db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gensymb.sty \
texlive-gensymb"

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
