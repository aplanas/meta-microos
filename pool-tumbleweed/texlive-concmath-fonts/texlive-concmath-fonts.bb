SUMMARY = "Concrete mathematics fonts"
DESCRIPTION = "The fonts are derived from the computer modern mathematics \
fonts and from Knuth's Concrete Roman fonts; they are \
distributed as Metafont source. LaTeX support is offered by the \
concmath package."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17218"

RPM_NAME = "texlive-concmath-fonts-2023.201.svn17218-53.1.noarch.rpm"
RPM_HASH = "1ccc04f6f2d0ecf9c73e881bc32df3038c362ce75b48d088d170541e703609406e48f828d437a275ab96ef700c639878404cd5c566e6e2bd74512a3af740893c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xccam10.tfm) \
tex(xccam5.tfm) \
tex(xccam6.tfm) \
tex(xccam7.tfm) \
tex(xccam8.tfm) \
tex(xccam9.tfm) \
tex(xccbm10.tfm) \
tex(xccbm5.tfm) \
tex(xccbm6.tfm) \
tex(xccbm7.tfm) \
tex(xccbm8.tfm) \
tex(xccbm9.tfm) \
tex(xccex10.tfm) \
tex(xccex7.tfm) \
tex(xccex8.tfm) \
tex(xccex9.tfm) \
tex(xccmi10.tfm) \
tex(xccmi5.tfm) \
tex(xccmi6.tfm) \
tex(xccmi7.tfm) \
tex(xccmi8.tfm) \
tex(xccmi9.tfm) \
tex(xccsy10.tfm) \
tex(xccsy5.tfm) \
tex(xccsy6.tfm) \
tex(xccsy7.tfm) \
tex(xccsy8.tfm) \
tex(xccsy9.tfm) \
texlive-concmath-fonts"

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
