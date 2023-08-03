SUMMARY = "Alter the format of \\label references"
DESCRIPTION = "LaTeX provides a mechanism for altering the appearance of \
references to labels, but it's somewhat flawed, and requires \
that the user manipulate internal commands. The package solves \
the problem, by providing a \\labelformat command for changing \
the format of references to labels. The package also provides a \
\\Ref command to make reference to such redefined labels at the \
start of a sentence."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn52090"

RPM_NAME = "texlive-fncylab-2023.209.1.1svn52090-53.1.noarch.rpm"
RPM_HASH = "1729319a7eb40d150fb594511d1878ce5a252c8750570b4f5be1ff2e4df40a1a7c39a7f6b918f87425876260415354430f7ae376a6f123a5663c282935980577"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fncylab.sty \
texlive-fncylab"

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
