SUMMARY = "Tools to dis-assemble and re-assemble DVI files"
DESCRIPTION = "DTL (DVI Text Language) is a means of expressing the content of \
a DVI file, which is readily readable by humans. The DTL bundle \
contains an assembler dt2dv (which produces DVI files from DTL \
files) and a disassembler dv2dt (which produces DTL files from \
DVI files). The DTL bundle was developed so as to avoid some \
infelicities of dvitype (among other pressing reasons)."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.6.1svn62387"

RPM_NAME = "texlive-dtl-2023.201.0.0.6.1svn62387-52.1.noarch.rpm"
RPM_HASH = "c7e0a7957771164c71e79cb9f5258ff94989af64b47f3fa461b67c048f5ed9ebf46467ef365e6b3deb80f06b2c772c745143da73c3100080db492ff3fab6a73c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dt2dv.1 \
man-dv2dt.1 \
texlive-dtl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dtl-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
