SUMMARY = "Header Files and C API Documentation for Tk"
DESCRIPTION = "This package contains header files and documentation needed for writing \
Tk extensions in compiled languages like C, C++, etc., or for embedding \
Tk in programs written in such languages. \
 \
This package is not needed for writing extensions or applications for \
Tk in the Tcl language itself. \
 \
 \
 \
Authors: \
-------- \
    The Tcl Core Team <tcl-core@lists.sourceforge.net>"
LICENSE = "TCL"

PV = "8.6.13"

RPM_NAME = "tk-devel-8.6.13-1.4.aarch64.rpm"
RPM_HASH = "89a7c6c8d1a81195c078bc6b6033cb6c450da368f02fcb88a2aa3655ad0fea509eb61513fff92f00e16e44a17178bf1a416c6da2894615806a3d30999c3f27d6"

RPROVIDES:${PN} += "pkgconfig-tk \
tk-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-tcl \
tcl-devel \
tk \
xorg-x11-libX11-devel"

inherit rpm
