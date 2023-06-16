SUMMARY = "More enumeration options"
DESCRIPTION = "The package provides the following new enumerate styles: \\greek \
for lowercase Greek letters; \\Greek for uppercase Greek \
letters; \\enumHex for uppercase hexadecimal enumeration; \
\\enumhex for lowercase hexadecimal enumeration; \\enumbinary for \
binary enumeration; \\enumoctal for octal enumeration; \\levelnth \
for '1st', '2nd', '3rd' etc., with the 'nth's on the baseline; \
raisenth for '1st', '2nd', '3rd' etc., with the 'nth's raised; \
\\nthwords for 'first', 'second', 'third' etc.; \\Nthwords for \
'First', 'Second', 'Third' etc.; \\NTHWORDS for 'FIRST', \
'SECOND', 'THIRD' etc.; \\nwords for 'one', 'two', 'three' etc.; \
\\Nwords for 'One', 'Two', 'Three' etc.; and \\NWORDS for 'ONE', \
'TWO', 'THREE' etc. Each of these works with enumitem's \
'starred variant' feature. So \
\\begin{enumerate}[label=\\enumhex*] will output a hex enumerated \
list. Enumitem provides a start=0 option for starting your \
enumerations at 0. The package requires amsmath, alphalph, \
enumitem (of course), binhex and nth, all of which are widely \
available."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn24479"

RPM_NAME = "texlive-moreenum-2023.201.1.03svn24479-54.1.noarch.rpm"
RPM_HASH = "25199002d515717ccfcf53b1a5b60a4301aa1b2c54116f440b79c4725f97d9550483ffff84beb75933eaa983349c0520d571ab9f1bd59d3b24e3abaad6a82dcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-moreenum.sty \
texlive-moreenum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphalph.sty \
tex-amsmath.sty \
tex-enumitem.sty \
tex-fmtcount.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
