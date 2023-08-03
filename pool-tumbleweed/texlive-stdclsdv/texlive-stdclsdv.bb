SUMMARY = "Provide sectioning information for package writers"
DESCRIPTION = "The stdclsdv package is designed for package writers who need \
to know what sectioning divsions are provided by the document's \
class. It also provides a version of \\CheckCommand that sets a \
flag rather than printing a warning."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn15878"

RPM_NAME = "texlive-stdclsdv-2023.209.1.1asvn15878-58.1.noarch.rpm"
RPM_HASH = "0fc4a07e37b9d47d1c9e77e160f1f48be7f13897d8da38c3545f07b760829ce2b4ccc8e08216a611466a3bb1e74b4befcff67e44efb472cc1754778ed1313a8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stdclsdv.sty \
texlive-stdclsdv"

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
