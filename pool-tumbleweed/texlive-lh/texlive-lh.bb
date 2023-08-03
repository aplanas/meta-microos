SUMMARY = "Cyrillic fonts that support LaTeX standard encodings"
DESCRIPTION = "The LH fonts address the problem of the wide variety of \
alphabets that are written with Cyrillic-style characters. The \
fonts are the original basis of the set of T2* and X2 encodings \
that are now used when LaTeX users need to write in Cyrillic \
languages. Macro support in standard LaTeX encodings is offered \
through the latex-cyrillic and t2 bundles, and the package \
itself offers support for other (more traditional) encodings. \
The fonts, in the standard T2* and X2 encodings are available \
in Adobe Type 1 format, in the CM-Super family of fonts. The \
package also offers its own LaTeX support for OT2 encoded \
fonts, CM bright shaped fonts and Concrete shaped fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.5gsvn15878"

RPM_NAME = "texlive-lh-2023.209.3.5gsvn15878-55.1.noarch.rpm"
RPM_HASH = "45310ee219af23fe603e960eae84de77c1042741c02b6f46eeb1cddd74ceecc65c5f7fbf5dd6ff533731e2a8d21361850f9a6feb1a1f2c7f3546ba32cce5634e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lh-lcy.sty \
tex-lh-lcyccr.sty \
tex-lh-lcyxccr.sty \
tex-lh-ot2.sty \
tex-lh-ot2ccr.sty \
tex-lh-ot2xccr.sty \
tex-lh-t2accr.sty \
tex-lh-t2axccr.sty \
tex-lh-t2bccr.sty \
tex-lh-t2bxccr.sty \
tex-lh-t2cccr.sty \
tex-lh-t2cxccr.sty \
tex-lh-x2ccr.sty \
tex-lh-x2xccr.sty \
tex-nfssfox.tex \
tex-testfox.tex \
tex-testkern.tex \
texlive-lh"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-ec \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
