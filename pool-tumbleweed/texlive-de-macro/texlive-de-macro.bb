SUMMARY = "Expand private macros in a document"
DESCRIPTION = "De-macro is a Python script that helps authors who like to use \
private LaTeX macros (for example, as abbreviations). A \
technical editor or a cooperating author may balk at such a \
manuscript; you can avoid manuscript rejection misery by \
running de-macro on it. De-macro will expand macros defined in \
\\(re)newcommand or \\(re)newenvironment commands, within the \
document, or in the document's 'private' package file."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.1svn61719"

RPM_NAME = "texlive-de-macro-2023.201.1.4.1svn61719-52.1.noarch.rpm"
RPM_HASH = "90be85b3a9d078542627d67b860801b4ee1f920fa84bac62bbd8ba5146b9e4194aa9fa9ead03e95c73daa353e78380b89f2ea913a5c22b21ec1f5bc6f82ce359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-de-macro"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-de-macro-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
