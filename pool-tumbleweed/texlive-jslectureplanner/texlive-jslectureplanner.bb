SUMMARY = "Creation and management of university course material"
DESCRIPTION = "The jslectureplanner package facilitates the generation and \
management of university course material. It provides an \
interface to set up and access centralized course data that can \
be reused in all course documents. Furthermore, the package is \
able to calculate the session dates of a whole semester and \
generate course programs, if the course is held weekly and the \
date of the first lecture is specified. Moreover, the package \
can be used to generate a sectioned course bibliography via \
BibLaTeX. The bundle also includes a package jsmembertable.sty \
that helps in generating course member and presence lists."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.12svn57095"

RPM_NAME = "texlive-jslectureplanner-2023.209.1.12svn57095-56.1.noarch.rpm"
RPM_HASH = "d0114e5000d96ef24cf6a27866abf70ba54486b45406ecc7d9fd21b10b9cb22ef9ec6e0bed58674650e53ae8719b01c838d14fa73a17970daf3f535f1d23de48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jslectureplanner.sty \
tex-jsmembertable.sty \
texlive-jslectureplanner"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-calc.sty \
tex-datatool.sty \
tex-datetime2.sty \
tex-etoolbox.sty \
tex-hhline.sty \
tex-ifthen.sty \
tex-longtable.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
