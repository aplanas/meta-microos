SUMMARY = "Define leading with a length"
DESCRIPTION = "The package defines a command \\leading, whose argument is a \
<length> that specifies the nominal distance between \
consecutive baselines of typeset text. The command replaces the \
rather more difficult LaTeX command \\linespread{<ratio>}, where \
the leading is specified by reference to the font size."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn15878"

RPM_NAME = "texlive-leading-2023.201.0.0.3svn15878-54.1.noarch.rpm"
RPM_HASH = "e1ebaf18f246d341adcdccfcd4e803c568a4a87f3c94683e47dd4463c3eb64070a646e5099ff6df457035d6ac79e22505577d2afb3ccc097915eb47ee5ef48ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(leading.sty) \
texlive-leading"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
