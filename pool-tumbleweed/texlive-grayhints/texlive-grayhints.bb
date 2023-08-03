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

PV = "2023.209.svn49052"

RPM_NAME = "texlive-grayhints-2023.209.svn49052-54.1.noarch.rpm"
RPM_HASH = "a76836ab14507b57c77b755789765705eaef912feb0e93627657c3546bb6433d3ea5946a81899cce8eec822838b749bca5af78daf280f4c99434f4732bee9340"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grayhints.sty \
texlive-grayhints"

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
