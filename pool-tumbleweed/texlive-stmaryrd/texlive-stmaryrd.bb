SUMMARY = "St Mary Road symbols for theoretical computer science"
DESCRIPTION = "The fonts were originally distributed as Metafont sources only, \
but Adobe Type 1 versions are also now available. Macro support \
is provided for use under LaTeX; the package supports the \
'only' option (provided by the somedefs package) to restrict \
what is loaded, for those who don't need the whole font."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn22027"

RPM_NAME = "texlive-stmaryrd-2023.209.svn22027-58.1.noarch.rpm"
RPM_HASH = "384a50cd7c2b8cbf4d982dc2abf4e4c1c6eb55732fd0e8734baee5cd186be1b13f8a26239f275f064208f974ece67840968bc53424e79fe4b45cda003cd985b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Ustmry.fd \
tex-stmary10.tfm \
tex-stmary5.tfm \
tex-stmary6.tfm \
tex-stmary7.tfm \
tex-stmary8.tfm \
tex-stmary9.tfm \
tex-stmaryrd.map \
tex-stmaryrd.sty \
texlive-stmaryrd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-stmaryrd-fonts"

inherit rpm
