SUMMARY = "Table heads with diagonal lines"
DESCRIPTION = "The package's principal command, \\diagbox, takes two arguments \
(texts for the slash-separated parts of the box), and an \
optional argument with which the direction the slash will go, \
the box dimensions, etc., may be controlled. The package also \
provides \\slashbox and \\backslashbox commands for compatibility \
with the slashbox package, which it supersedes. diagbox depends \
on e-TeX as well as the packages array, calc, fp, keyval, and \
pict2e."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4svn54080"

RPM_NAME = "texlive-diagbox-2023.201.2.4svn54080-52.1.noarch.rpm"
RPM_HASH = "13ed4cf914bdec010fd73991c26af7540176e087711ee7b6231b3a5baf700cb70054d2b7b0ccec8fe112583dd04c5d5125af28c50b023cf528adeb6a558cc4d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(diagbox.sty) \
texlive-diagbox"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
tex(calc.sty) \
tex(fp.sty) \
tex(keyval.sty) \
tex(pict2e.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
