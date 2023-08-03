SUMMARY = "Index citations by author names"
DESCRIPTION = "This package allows the user to create an index of all authors \
cited in a LaTeX document. Each author entry in the index \
contains the pages where these citations occur. Alternatively, \
the package can list the labels of the citations that appear in \
the references rather than the text pages. The package relies \
on BibTeX being used to handle citations. Additionally, it \
requires Perl (version 5 or higher)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn51757"

RPM_NAME = "texlive-authorindex-2023.209.svn51757-54.1.noarch.rpm"
RPM_HASH = "aeb81ff25e68daf53f952433c1590c1e9fa78c01a0bc52d3640bc0cf994a5aa971fd7611e868cceb116f9bcf62031447ba1559192f81f471feae0ffccac9865b"
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
