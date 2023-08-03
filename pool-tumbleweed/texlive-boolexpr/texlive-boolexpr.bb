SUMMARY = "A boolean expression evaluator and a switch command"
DESCRIPTION = "The \\boolexpr macro evaluates boolean expressions in a purely \
expandable way. \\boolexpr{ A \\OR B \\AND C } expands to 0 if the \
logical expression is TRUE. A, B, C may be: numeric expressions \
such as: x=y, x<>y, x>y or x<y; - boolean switches: \\iftrue \
0\\else 1\\fi; - conditionals: \\ifcsname whatsit\\endcsname 0\\else \
1\\fi; - another \\boolexpr: \\boolexpr{ D \\OR E \\AND F }: \
\\boolexpr may be used with \\ifcase: \\ifcase\\boolexpr{ A \\OR B \
\\AND C } What to do if true \\else What to do if false \\fi The \
\\switch command (which is also expandable) has the form: \
\\switch \\case{<boolean expression>} ... \\case{<boolean \
expression>} ... ... \\otherwise ... \\endswitch"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.14svn17830"

RPM_NAME = "texlive-boolexpr-2023.209.3.14svn17830-53.1.noarch.rpm"
RPM_HASH = "70a388f0a33274443a8ca2240f47afbaff9b0dc82719138a752f04a39078317c1b9240717144c4389e61f8158aec00c6f321debbdc0bc6c93d919bd68dde7bcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-boolexpr.sty \
texlive-boolexpr"

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
