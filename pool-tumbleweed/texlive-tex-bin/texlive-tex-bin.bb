SUMMARY = "Binary files of tex"
DESCRIPTION = "Binary files of tex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-tex-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "41f0861011ab31ce1b0ef5de626bd7ce0785f38e6eaf5642d3119ab5dc9295ec2444753cc7289e69b31bca6612337ca15a75c86059834982ac3351a8fc048864"

RPROVIDES:${PN} += "texlive-tex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-tex"

inherit rpm
