SUMMARY = "UK format dates, with weekday"
DESCRIPTION = "The package is used to change the format of \\today's date, \
including the weekday, e.g., 'Saturday, 26 June 2008', the 'UK \
format', which is preferred in many parts of the world, as \
distinct from that which is used in \\maketitle of the article \
class, 'June 26, 2008', the 'US format'."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.04svn15878"

RPM_NAME = "texlive-eukdate-2023.209.1.04svn15878-53.1.noarch.rpm"
RPM_HASH = "7bd8a1cea6c938718e8fc07b91f88bbb4f836657be0df1c812501208d35083cd5eedcfe507d375b0143e898d0a48928ee389163e3131c569a286ad3393cc819a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eukdate.sty \
texlive-eukdate"

RDEPENDS:${PN} += "/usr/bin/sh \
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
