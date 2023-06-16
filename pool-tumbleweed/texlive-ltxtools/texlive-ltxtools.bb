SUMMARY = "A collection of LaTeX API macros"
DESCRIPTION = "This is a bundle of macros that the author uses in the coding \
of others of his macro files."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.1asvn24897"

RPM_NAME = "texlive-ltxtools-2023.201.0.0.0.1asvn24897-52.1.noarch.rpm"
RPM_HASH = "cb35acbce9591567ac3b78d126e6d1246d8da45683b08eb36aeed9a0d6509e38b9928b015c10081ae44dcd6cc0c555c40e29fd511b562a043c1e74160c8a64dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltxtools-base.sty \
tex-ltxtools-doc.sty \
tex-ltxtools-environ.sty \
tex-ltxtools-incluput.sty \
tex-ltxtools-index.sty \
tex-ltxtools-review.sty \
tex-ltxtools-trace.sty \
tex-ltxtools.sty \
texlive-ltxtools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atveryend.sty \
tex-catoptions.sty \
tex-fp.sty \
tex-ltxkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
