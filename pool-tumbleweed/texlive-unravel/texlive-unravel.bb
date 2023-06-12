SUMMARY = "Watching TeX digest tokens"
DESCRIPTION = "The aim of this LaTeX package is to help debug complicated \
macros. This is done by letting the user step through the \
execution of some TeX code, going through the details of nested \
expansions, performing assignments, as well as some simple \
typesetting commands. To use this package, one should normally \
run TeX in a terminal. The unravel package requires up-to-date \
versions of the l3kernel, l3packages and l3experimental \
bundles."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3asvn59175"

RPM_NAME = "texlive-unravel-2023.201.0.0.3asvn59175-53.1.noarch.rpm"
RPM_HASH = "724b85fe7cfc4ab34d00d13dde0b1a899f447984969afa6a496a6c3a22c03ee18fc0c9bdcc5ee11187a6a83f86bde547ec211c73b93b28b627c3430651564f0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(unravel.sty) \
texlive-unravel"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(gtl.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
