SUMMARY = "Produce 'gray hints' to a variable text field"
DESCRIPTION = "The package provides JavaScript code snippets to create 'gray \
hints'. Gray hints, as the author terms them, are text that \
appears initially in a text field that gives a short hint as to \
what the contents of the text field should be. For example, a \
text field might contain the hint 'First Name', or a date field \
might read 'yyyy/mm/dd'. As soon as the field comes into focus, \
the hint disappears. It reappears when the field is blurred and \
the user did not enter any text into the field. The package \
works for dvips/Distiller, pdfLaTeX, LuaLaTeX, and XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn49052"

RPM_NAME = "texlive-grayhints-2023.201.svn49052-53.1.noarch.rpm"
RPM_HASH = "96c8bed1d50635c5a762efd59e315df465d9be05dc58764d2194067bcef022213bae46ac6b3cfc4316fbdfdfd73107ea87d747e5df74284e2e11307872b48d65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(grayhints.sty) \
texlive-grayhints"

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
