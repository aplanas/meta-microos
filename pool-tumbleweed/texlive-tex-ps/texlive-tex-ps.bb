SUMMARY = "TeX to PostScript generic macros and add-ons"
DESCRIPTION = "TeX to PostScript generic macros and add-ons: transformations \
of EPS files, prepress preparation, color separation, mirror, \
etc."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-tex-ps-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "cd80fca319751d50045b223ebaa134bbfc01fa762899718633dc4220ff004966b840f5f3e059bf0dfcdf074a16ded193233ce6bbd508443ae47d86a47069bfa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cmyk-hax.tex) \
tex(epsfx.tex) \
tex(poligraf.sty) \
tex(trans.tex) \
texlive-tex-ps"

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
