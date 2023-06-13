SUMMARY = "Thesis class for George Washington University School of Engineering and Applied Science"
DESCRIPTION = "This class is an attempt to create a standard format for GWU \
SEAS dissertations/theses. It automatically handles many of the \
complicated formatting requirements and includes many useful \
packages. An example thesis is provided serving as a user guide \
and a demonstration of the thesis."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.7.0svn54287"

RPM_NAME = "texlive-thesis-gwu-2023.201.1.7.0svn54287-54.1.noarch.rpm"
RPM_HASH = "b6dde2ed8cfce00cf828987b477c801a18c1db0fc49ee9571215b8f0dfcd412547c856af0e4713192d7223516e44c4f06fc55497b2fecd4f96956de33c19c738"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(thesis-gwu.cls) \
texlive-thesis-gwu"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(report.cls) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
