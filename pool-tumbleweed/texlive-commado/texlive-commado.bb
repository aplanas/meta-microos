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

PV = "2023.209.r0.11asvn38875"

RPM_NAME = "texlive-commado-2023.209.r0.11asvn38875-54.1.noarch.rpm"
RPM_HASH = "ed9540ebf35a89fdec825b6ee6894fdc5383b851b2730406bcd909acb2945bf2bb39f809be5033c4955e0294d432e746d2f51df9d9defa5c7e0794f0a4be64ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-commado.sty \
tex-filesdo.sty \
texlive-commado"

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
