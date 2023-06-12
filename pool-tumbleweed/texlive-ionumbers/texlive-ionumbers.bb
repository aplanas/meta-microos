SUMMARY = "Restyle numbers in maths mode"
DESCRIPTION = "'ionumbers' stands for 'input/output numbers'. The package \
restyles numbers in maths mode. If a number in the input file \
is written, e.g., as $3,231.44$ as commonly used in English \
texts, the package is able to restyle it to be output as \
$3\\,231{,}44$ as commonly used in German texts (and vice \
versa). This may be useful, for example, if you have a large \
table and want to include it in texts with different output \
conventions without the need to change the table. The package \
can also automatically group digits left of the decimal \
separator (thousands) and right of the decimal separator \
(thousandths) in triplets without the need of specifing commas \
(English) or points (German) as separators. E.g., the input \
$1234.567890$ can be output as $1\\,234.\\,567\\,890$. Finally, an \
e starts the exponent of the number. For example, $21e6$ may be \
output as $26\\times10\\,^{6}$."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.3.3svn33457"

RPM_NAME = "texlive-ionumbers-2023.201.0.0.3.3svn33457-55.1.noarch.rpm"
RPM_HASH = "7d6aaaedd1b96d9cdeda657a4a6bf448cbafb382d6dc990daecd21a32aabbd486af5397f5241626644c0ca5388364536ce9c62077f1871a4accb41d8ff9b5ba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ionumbers.sty) \
texlive-ionumbers"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(keyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
