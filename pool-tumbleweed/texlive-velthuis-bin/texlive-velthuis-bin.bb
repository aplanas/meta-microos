SUMMARY = "Binary files of velthuis"
DESCRIPTION = "Binary files of velthuis"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-velthuis-bin-2023.20230311.svn62210-93.1.aarch64.rpm"
RPM_HASH = "52d93ae1392e39609799a3187ed08ae8040e2bfd91a2516eaef5454ab12f28bcb491ef719e8b92d550596cb4939a3f32291ef2d77b06513fe0123b3d58899a67"

RPROVIDES:${PN} += "texlive-velthuis-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-velthuis"

inherit rpm
