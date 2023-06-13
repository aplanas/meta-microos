SUMMARY = "Change the Bibliography/References title"
DESCRIPTION = "Defines a single command, \\setbibref, which sets whichever of \
\\bibname and \\refname is in use. (\\bibname is used in book.cls \
and report.cls, and \\refname is used in article.cls.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn17120"

RPM_NAME = "texlive-chbibref-2023.201.1.0svn17120-53.1.noarch.rpm"
RPM_HASH = "589c2c1f5b8a2a388dfc9ef9f65151be6982fe11df6d83c2329527c2fef20aa511c9d3087f502da0e22cc863bf9fde840e9eba9be19f4fc47014ff29aecc6317"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(chbibref.sty) \
texlive-chbibref"

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
