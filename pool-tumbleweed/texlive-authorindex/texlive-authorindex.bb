SUMMARY = "Index citations by author names"
DESCRIPTION = "This package allows the user to create an index of all authors \
cited in a LaTeX document. Each author entry in the index \
contains the pages where these citations occur. Alternatively, \
the package can list the labels of the citations that appear in \
the references rather than the text pages. The package relies \
on BibTeX being used to handle citations. Additionally, it \
requires Perl (version 5 or higher)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn51757"

RPM_NAME = "texlive-authorindex-2023.201.svn51757-53.1.noarch.rpm"
RPM_HASH = "4c1ef552d0822476d6a9cc959cef3d599569fdcad33c1ab408b053813e56090c7ae1c63bc181ed5121d813e6713e2385c5cdfe35569aa920f525e7980e57bbf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-authorindex.sty \
texlive-authorindex"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Std \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-authorindex-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
