SUMMARY = "Binary files of chktex"
DESCRIPTION = "Binary files of chktex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-chktex-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "1752d88d3fd2bc9d0c99d7346fe236132bc17cc7ad82c678baaaa246aedf73289bfc2dbb9a9e2141c05ec2a0ac1d9b97cfd4b98fe61d8ea06740a2b38068c528"

RPROVIDES:${PN} += "texlive-chktex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-chktex"

inherit rpm
