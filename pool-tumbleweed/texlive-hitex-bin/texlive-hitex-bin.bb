SUMMARY = "Binary files of hitex"
DESCRIPTION = "Binary files of hitex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-hitex-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "6c8a7cdbe59e9f47298c65c8a7f0b597665cb9059ef29fb6972aa3b0d542707df78aa8f8a134a017846a815b1057f5418bad222aebe0115446a60e174ec2954a"

RPROVIDES:${PN} += "texlive-hitex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
libz.so.1 \
texlive-hitex"

inherit rpm
