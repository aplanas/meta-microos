SUMMARY = "Provide sectioning information for package writers"
DESCRIPTION = "The stdclsdv package is designed for package writers who need \
to know what sectioning divsions are provided by the document's \
class. It also provides a version of \\CheckCommand that sets a \
flag rather than printing a warning."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn15878"

RPM_NAME = "texlive-stdclsdv-2023.201.1.1asvn15878-57.1.noarch.rpm"
RPM_HASH = "38bcd92d279fd56c47a98b67bc1cb734e85abb7a9f114db0648a35cba5c1bf7a185edbb1eacdb2a0bb1a48e275e7f5812899a5608a3fe7da74dd3c43549960a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(stdclsdv.sty) \
texlive-stdclsdv"

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
