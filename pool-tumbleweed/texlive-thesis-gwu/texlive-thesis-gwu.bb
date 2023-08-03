SUMMARY = "Thesis class for George Washington University School of Engineering and Applied Science"
DESCRIPTION = "This class is an attempt to create a standard format for GWU \
SEAS dissertations/theses. It automatically handles many of the \
complicated formatting requirements and includes many useful \
packages. An example thesis is provided serving as a user guide \
and a demonstration of the thesis."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.7.0svn54287"

RPM_NAME = "texlive-thesis-gwu-2023.209.1.7.0svn54287-55.1.noarch.rpm"
RPM_HASH = "e1622a809f2d34409bb42050862d95d38ac24aff18c93455e6b8a66f5f613bc993e72adcf12fed7de0c6e08390d80bb1fb6b7fc0f83e4b408b98832d754d7be7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thesis-gwu.cls \
texlive-thesis-gwu"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-report.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
