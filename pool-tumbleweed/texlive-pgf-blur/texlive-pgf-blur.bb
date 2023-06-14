SUMMARY = "PGF/TikZ package for 'blurred' shadows"
DESCRIPTION = "The package adds blurred/faded/fuzzy shadows to PGF/TikZ \
pictures. It is configured as a TikZ/PGF library module. The \
method is similar to that of the author's pst-blur package for \
PSTricks."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn54512"

RPM_NAME = "texlive-pgf-blur-2023.201.1.02svn54512-51.1.noarch.rpm"
RPM_HASH = "4f3bc9282b26f158df0370258ff6e20ac1a158a8895ba922f53065c23a94d5601160a54377480582271df821f24e0188d6210dab6e5075af18dbc65286b1b354"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibraryshadows.blur.code.tex \
texlive-pgf-blur"

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
