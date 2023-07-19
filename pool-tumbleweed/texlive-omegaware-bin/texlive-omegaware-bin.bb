SUMMARY = "Binary files of omegaware"
DESCRIPTION = "Binary files of omegaware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-omegaware-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "723be6a993c0b0069ba8065f11914abd787eaff35e58b619f80de3fabf776a04039c8ace702a66fff836da880a7c3aadb946fb503318422244354a6a17ad67fe"

RPROVIDES:${PN} += "texlive-omegaware-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-omegaware \
texlive-uptex-bin"

inherit rpm
