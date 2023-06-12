SUMMARY = "Binary files of omegaware"
DESCRIPTION = "Binary files of omegaware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-omegaware-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "07cc8e96ef8cf6ec1ee57ebb358be18b45ad18eebed567fa4036442238ee5f1972a958332f5e9e5f07c2a3d992033543361eeaacd49ca7bfd903b0f1644e4ee6"

RPROVIDES:${PN} += "texlive-omegaware-bin \
texlive-omegaware-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkpathsea.so.6()(64bit) \
texlive-omegaware \
texlive-uptex-bin"

inherit rpm
