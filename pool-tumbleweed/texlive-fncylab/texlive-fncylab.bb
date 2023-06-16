SUMMARY = "Alter the format of \\label references"
DESCRIPTION = "LaTeX provides a mechanism for altering the appearance of \
references to labels, but it's somewhat flawed, and requires \
that the user manipulate internal commands. The package solves \
the problem, by providing a \\labelformat command for changing \
the format of references to labels. The package also provides a \
\\Ref command to make reference to such redefined labels at the \
start of a sentence."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn52090"

RPM_NAME = "texlive-fncylab-2023.201.1.1svn52090-52.1.noarch.rpm"
RPM_HASH = "3bad9743203944b2d247b02dfaab06974085593d5978fc2897959915ac4dc180edb93b8da9b59c7f3995f96380be473f06b5f232ff3432ce7b5a5b1f2a830f5e"
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
