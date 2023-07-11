SUMMARY = "Binary files of omegaware"
DESCRIPTION = "Binary files of omegaware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-omegaware-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "b16246b95ddd4a2a4d64bd47135a0a3e0077e39d63ea14318411c35f517386ef7f8387795d6e4a89b81c523d2920b2f3ecdc99590af036f80207226e39aa1d9c"

RPROVIDES:${PN} += "texlive-omegaware-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-omegaware \
texlive-uptex-bin"

inherit rpm
