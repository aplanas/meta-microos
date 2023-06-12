SUMMARY = "Binary files of metafont"
DESCRIPTION = "Binary files of metafont"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-metafont-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "5757f79ca23cbf707a5bf1db54b8db54137ef539daf8117165309c786d48a8fd715ad4bf5fa7eaefe6371660428b5063e25ca4ee8990da75ff3a8371f2b75c24"

RPROVIDES:${PN} += "texlive-metafont-bin \
texlive-metafont-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkpathsea.so.6()(64bit) \
texlive-metafont"

inherit rpm
