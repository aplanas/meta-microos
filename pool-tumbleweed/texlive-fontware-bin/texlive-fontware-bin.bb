SUMMARY = "Binary files of fontware"
DESCRIPTION = "Binary files of fontware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-fontware-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "a7e244c398838b558b09bd41fafb9cef733413019023930352a2d7428533f2e78d81543a940b8989a15ab298cd73b0f8e59321a37635b99914df05f2cbb40c9c"

RPROVIDES:${PN} += "texlive-fontware-bin \
texlive-fontware-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkpathsea.so.6()(64bit) \
texlive-fontware"

inherit rpm
