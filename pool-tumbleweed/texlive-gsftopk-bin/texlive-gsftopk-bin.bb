SUMMARY = "Binary files of gsftopk"
DESCRIPTION = "Binary files of gsftopk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-gsftopk-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "644b9376f432f61dbff05339b6fc1f8e607f3f81224d3bcf5856ff2db9ce34f676a2f9e301333354122ac5e381c7e59d16b7e0d054caa1d01adaf289cfa39f75"

RPROVIDES:${PN} += "texlive-gsftopk-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-gsftopk"

inherit rpm
