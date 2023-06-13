SUMMARY = "Additional TeX-family logos"
DESCRIPTION = "The hologo package provides many useful logos of popular (and \
not so popular) TeX-family software. However, its interface is \
a bit cumbersome because you must type \\hologo{BibTeX} instead \
of \\BibTeX. This package makes it possible to import some of \
the logos provided by hologo as single commands, such as \
\\BibTeX. Additionally, the package provides logos of some \
TeX-family software that is popular mainly in Japan. These \
logos can be imported in the same way as those provided by the \
\\hologo command. bxtexlogo depends on hologo and cjhebrew (if \
\\logoAleph and \\logoLamed are used)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn63231"

RPM_NAME = "texlive-bxtexlogo-2023.201.0.0.6svn63231-52.1.noarch.rpm"
RPM_HASH = "26bf8f68ac1b3d01cb08ed4333da23802836be38f7bec14fddaf7e92f8eacd4dc7773ad3e8146b1f546dec4649d845e50ea4eef1da2c4ab9b9753b06a72889a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bxtexlogo.sty) \
texlive-bxtexlogo"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(hologo.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
