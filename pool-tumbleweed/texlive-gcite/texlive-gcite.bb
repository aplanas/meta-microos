SUMMARY = "Citations in a reader-friendly style"
DESCRIPTION = "The package allows citations in the German style, which is \
considered by many to be particularly reader-friendly. The \
citation provides a small amount of bibliographic information \
in a footnote on the page where each citation is made. It \
combines a desire to eliminate unnecessary page-turning with \
the look-up efficiency afforded by numeric citations. The \
package makes use of BibLaTeX, and is considered experimental; \
comment is invited."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn15878"

RPM_NAME = "texlive-gcite-2023.201.1.0.1svn15878-52.1.noarch.rpm"
RPM_HASH = "237e4cb04e6fe1a542adf5dd833045fd9eb4a9c1458f3b1909785617ed4cd9332c29090ef116ad7eb565fdf34fa4dbc7dba05e993ea459dba133fc602781a7d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gcite.sty) \
texlive-gcite"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(biblatex.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
