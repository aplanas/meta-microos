SUMMARY = "Format chapters with a texi-like format"
DESCRIPTION = "The package enables the user to reduce the size of the rather \
large chapter headings in standard classes into a texi-like \
smaller format. Details of the format may be controlled with \
internal commands."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn28553"

RPM_NAME = "texlive-texilikechaps-2023.201.1.0asvn28553-54.1.noarch.rpm"
RPM_HASH = "2540b6d33ec5866aac3a6c63ad213fbd7de2b10a8c8310d34d0e8c6da68e371596bb4efe2734aaee6830fadfe783c33b0eb7629acf50c9821aabf2f2d6e193d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(texilikechaps.sty) \
texlive-texilikechaps"
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
