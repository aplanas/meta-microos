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

PV = "2023.209.0.0.6svn63231"

RPM_NAME = "texlive-bxtexlogo-2023.209.0.0.6svn63231-53.1.noarch.rpm"
RPM_HASH = "5e2f61a6928fdc6f6d4c9e39b7853f08a028f5ccf4f1939d03364ac0fc03767c59cd6dd76c6bf4fc273b4d1ec60512efaa10fe7388a3ca8c733f9133089ece6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxtexlogo.sty \
texlive-bxtexlogo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hologo.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
