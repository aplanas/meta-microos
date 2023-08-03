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

PV = "2023.209.1.03svn24479"

RPM_NAME = "texlive-moreenum-2023.209.1.03svn24479-55.1.noarch.rpm"
RPM_HASH = "3f45ac1f9c5a4b4329c1cd7b6ddc4080adf72cdc2284667192b105ffe88db962946e0c98559779aa3bb91fd691d74157eea0de853e6194c93269c3e4c04d3f09"
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
