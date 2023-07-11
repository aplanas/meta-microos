SUMMARY = "Binary files of afm2pl"
DESCRIPTION = "Binary files of afm2pl"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-afm2pl-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "824294fce48fb2c01595ac7da0b28cd26b8562304c3eca1d29a010bb95c18e9318c89c3afe9360701281728608bb9ef05f482802c166c568825398bca5504fb1"

RPROVIDES:${PN} += "texlive-afm2pl-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
libm.so.6 \
texlive-afm2pl"

inherit rpm
