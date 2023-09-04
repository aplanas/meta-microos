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

RPM_NAME = "texlive-grayhints-2023.209.svn49052-54.2.noarch.rpm"
RPM_HASH = "890a7d9f1db97af9950e221a7e2050f3b5cd0cbbc9d2ce256e0720cc4b0fdd3d4cf9b8f64bb61be28018187548a3d4bc4a6ba9454a5610ce2ab67ba9b48be0ef"
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
