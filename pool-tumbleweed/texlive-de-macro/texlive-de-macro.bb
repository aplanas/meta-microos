SUMMARY = "Expand private macros in a document"
DESCRIPTION = "De-macro is a Python script that helps authors who like to use \
private LaTeX macros (for example, as abbreviations). A \
technical editor or a cooperating author may balk at such a \
manuscript; you can avoid manuscript rejection misery by \
running de-macro on it. De-macro will expand macros defined in \
\\(re)newcommand or \\(re)newenvironment commands, within the \
document, or in the document's 'private' package file."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4.1svn61719"

RPM_NAME = "texlive-de-macro-2023.209.1.4.1svn61719-53.1.noarch.rpm"
RPM_HASH = "60e9126e00164ad758bce8c905691df279c03a122e65038ba88cb6ad534c8a50d7d45be5f8ac1c1099091504fc446379b1ea63e654a26ffa80062d4adaed0365"
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
