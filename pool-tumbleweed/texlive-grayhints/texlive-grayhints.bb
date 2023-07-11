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

RPM_NAME = "texlive-grayhints-2023.201.svn49052-53.2.noarch.rpm"
RPM_HASH = "5478a313f5b9b58ad02bcd6a37e443cde6791164d106b42dd07c60d2440039d6feafd3d56d93d3cfcd3ffee26ba20fd8a68f441484565b522937bfeb5bcb6d1d"
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
