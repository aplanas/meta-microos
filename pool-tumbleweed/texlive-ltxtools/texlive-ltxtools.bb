SUMMARY = "A collection of LaTeX API macros"
DESCRIPTION = "This is a bundle of macros that the author uses in the coding \
of others of his macro files."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.0.1asvn24897"

RPM_NAME = "texlive-ltxtools-2023.208.0.0.0.1asvn24897-53.1.noarch.rpm"
RPM_HASH = "31ab576747f4af9b2ffd9dc1448d554827b2eac0310d144c95c20a4014ada7480504332a09d435f671e09da98d86de8299c58e5feb92f4cede0fe9fcdc04728a"
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
