SUMMARY = "Binary files of dviout-util"
DESCRIPTION = "Binary files of dviout-util"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dviout-util-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "9546f20b0fafc943131c38d636cf49c557d4fd0fba204ad33caf53bce34f3d1051e12bcb5bdba92689eb31c6848dcb09ce943bdd683d8a3e3ae64e84e5d2c55d"

RPROVIDES:${PN} += "texlive-dviout-util-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libptexenc.so.1 \
texlive-dviout-util"

inherit rpm
