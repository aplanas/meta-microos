SUMMARY = "Define commands which expand to verbatim text"
DESCRIPTION = "The package defines a single command \\verbdef (which has a \
*-form, like \\verb). \\verbdef will define a robust command \
whose body expands to verbatim text. By using commands defined \
by \\verbdef, one can put verbatim text into the arguments of \
commands; since the defined command is robust, it doesn't \
matter if the argument is moving. (Full details of syntax and \
caveats about use are in comments in the file itself.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn17177"

RPM_NAME = "texlive-verbdef-2023.201.0.0.2svn17177-53.1.noarch.rpm"
RPM_HASH = "a6ed17cd6097ca443547f3ba95e95e88919f0b1dd81ba0e9288ec336d33d0be92248aa3ec136782de38fde5f1b6e330d25b575e719ee47b26dbcc3496bf4b998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(verbdef.sty) \
texlive-verbdef"

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
