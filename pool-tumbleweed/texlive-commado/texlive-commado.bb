SUMMARY = "Expandable iteration on comma-separated and filename lists"
DESCRIPTION = "The bundle provides two packages: commado and filesdo. The \
package commado provides the command \\DoWithCSL: \
\\DoWithCSL{<cmd>}{<list>} applies an existing one-parameter \
macro <cmd> to each item in a list <list> in which terms are \
separated by commas. The package filesdo provides the command \
\\DoWithBasesExts: \\DoWithBasesExts{<cmd>}{<bases>}{<exts>} \
which runs the single parameter command <cmd> on each file \
whose base and extension are respectively from the \
comma-separated lists <bases> and <exts>. These 'loop'-like \
commands are (themselves) entirely expandable. The packages \
rely on packages plainpkg, and stacklet"
LICENSE = "LPPL-1.0"

PV = "2023.201.r0.11asvn38875"

RPM_NAME = "texlive-commado-2023.201.r0.11asvn38875-53.1.noarch.rpm"
RPM_HASH = "df359991646747d4456b8395611ba57d2e018d026c0a4cdc715d449185391ed655dc22cfbe48731b99f51b0b8a8cd92cd8564592000576baa883a7dbffa1ffac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(commado.sty) \
tex(filesdo.sty) \
texlive-commado"
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
