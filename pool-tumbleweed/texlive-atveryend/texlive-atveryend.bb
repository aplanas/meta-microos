SUMMARY = "Hooks at the very end of a document"
DESCRIPTION = "This LaTeX packages provides two hooks for \\end{document} that \
are executed after the hook of \\AtEndDocument: \
\\AfterLastShipout can be used for code that is to be executed \
right after the last \\clearpage before the `.aux' file is \
closed. \\AtVeryEndDocument is used for code after closing and \
final reading of the `.aux' file."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.11svn53108"

RPM_NAME = "texlive-atveryend-2023.209.1.11svn53108-54.1.noarch.rpm"
RPM_HASH = "1f7c8486dc196af7480bffc8f2ede24704ed1bb2104cb9a5fbe8fe6354df1b97d5c2e8c9b3ae216688b8f9ad24d6b32b8119adb6a9eefe22f69567c615a9032d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-atveryend.sty \
texlive-atveryend"

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
