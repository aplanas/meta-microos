SUMMARY = "X11 library for Ghostscript"
DESCRIPTION = "This package contains the X11 library which is needed \
to view PostScript and PDF files with Ghostscript \
under the X Window System."
LICENSE = "AGPL-3.0-only"

PV = "9.56.1"

RPM_NAME = "ghostscript-x11-9.56.1-3.1.aarch64.rpm"
RPM_HASH = "cab33ef372f2f0570d9a5b9f6fdbbdc7d2fefec40b22ff1051a34bbbe853dee1ed6c6e2e5e4282ee24ad2e8aac4f5a5b41585bfe19b1014cbfcb9440056004ca"

RPROVIDES:${PN} += "ghostscript-x11 \
ghostscript-x11(aarch-64) \
ghostscript_x11"

RDEPENDS:${PN} += "ghostscript \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
