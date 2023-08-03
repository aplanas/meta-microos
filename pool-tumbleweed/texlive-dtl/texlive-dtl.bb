SUMMARY = "Tools to dis-assemble and re-assemble DVI files"
DESCRIPTION = "DTL (DVI Text Language) is a means of expressing the content of \
a DVI file, which is readily readable by humans. The DTL bundle \
contains an assembler dt2dv (which produces DVI files from DTL \
files) and a disassembler dv2dt (which produces DTL files from \
DVI files). The DTL bundle was developed so as to avoid some \
infelicities of dvitype (among other pressing reasons)."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.6.1svn62387"

RPM_NAME = "texlive-dtl-2023.209.0.0.6.1svn62387-53.1.noarch.rpm"
RPM_HASH = "484e5647d7a1db93de4db13fa472a3650482d80fcabafc9e439acb78ee1e183651264c7f19df89bde21bd118493486ef15f8747107f4d6d5965fbf6148783316"
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
