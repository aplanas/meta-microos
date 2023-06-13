SUMMARY = "Documentation support for C, Java and assembler code"
DESCRIPTION = "The package provides a simple means of typesetting computer \
programs such that the result is acceptable for inclusion in \
reports, etc."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn34521"

RPM_NAME = "texlive-documentation-2023.201.0.0.1svn34521-52.1.noarch.rpm"
RPM_HASH = "0897a9ce19cce7c1d9b41ea4a86c0c08574153ffdb552073a05eb37e4cca537d9763a08889600deba3af9228afaa09d9d5193437f67142f7c30c66b236cf75a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(documentation.sty) \
texlive-documentation"

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
