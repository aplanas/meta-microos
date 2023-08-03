SUMMARY = "Define commands which expand to verbatim text"
DESCRIPTION = "The package defines a single command \\verbdef (which has a \
*-form, like \\verb). \\verbdef will define a robust command \
whose body expands to verbatim text. By using commands defined \
by \\verbdef, one can put verbatim text into the arguments of \
commands; since the defined command is robust, it doesn't \
matter if the argument is moving. (Full details of syntax and \
caveats about use are in comments in the file itself.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn17177"

RPM_NAME = "texlive-verbdef-2023.209.0.0.2svn17177-54.1.noarch.rpm"
RPM_HASH = "6c43088a8ea6d108f717b2091f5b1a24e0a8d082170cfd4753630781d7a882fef6b72dc4cc9b485bf3e992d391e4a9a6116cd091acedef0ee9a5f06cccf69c18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-verbdef.sty \
texlive-verbdef"

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
