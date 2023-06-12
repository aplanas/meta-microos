SUMMARY = "Binary files of upmendex"
DESCRIPTION = "Binary files of upmendex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66511"

RPM_NAME = "texlive-upmendex-bin-2023.20230311.svn66511-91.1.aarch64.rpm"
RPM_HASH = "6a5c0c1334d5bcb3e7a4293982b1013c2f7683e7f5b12e487edd1e9c0b96c911866fe39db55a11f91f9bd65da7405494922f786d318051f5f4340599e3e6ba5f"

RPROVIDES:${PN} += "texlive-upmendex-bin \
texlive-upmendex-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libkpathsea.so.6()(64bit) \
texlive-upmendex"

inherit rpm