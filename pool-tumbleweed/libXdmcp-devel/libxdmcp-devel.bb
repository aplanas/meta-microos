SUMMARY = "Development files for the XDM Control Protocol library"
DESCRIPTION = "The X Display Manager Control Protocol (XDMCP) provides a uniform \
mechanism for an autonomous display to request login service from a \
remote host. By autonomous, we mean the display consists of hardware \
and processes that are independent of any particular host where login \
service is desired. An X terminal (screen, keyboard, mouse, \
processor, network interface) is a prime example of an autonomous \
display. \
 \
This package contains the development headers for the library found \
in libXdmcp6."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "libXdmcp-devel-1.1.4-1.2.aarch64.rpm"
RPM_HASH = "4eb8b081d84006a250ef92e3d4e8dd0bb59e4a4ef233256476bc13b57209e859f7a00d5fc01db5309b2a12a3c325710641979d87733d953a39e9d341f15df2fc"

RPROVIDES:${PN} += "libXdmcp-devel \
pkgconfig-xdmcp \
xorg-x11-libXdmcp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXdmcp6 \
pkgconfig-xproto"

inherit rpm
