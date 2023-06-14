SUMMARY = "Use LaTeX as a scientific calculator"
DESCRIPTION = "The calculator and calculus packages define several \
instructions which allow us to realise algebraic operations and \
to evaluate elementary functions and derivatives in our \
documents. The package's main goal is to define the arithmetic \
and functional calculations needed in the author's package \
xpicture, but the numeric abilities of 'calculator' and \
'calculus' may be useful in other contexts."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn64424"

RPM_NAME = "texlive-calculator-2023.201.2.1svn64424-52.1.noarch.rpm"
RPM_HASH = "537f8e2eb083e35f791b1f49894ea16ffe201274abfd253579d33cbdb621df261bff469cef93513f88a0d9e6a526cbc387b6dc8f46ac2c6df7e34b060bf7d307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-calculator.sty \
tex-calculus.sty \
texlive-calculator"

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
