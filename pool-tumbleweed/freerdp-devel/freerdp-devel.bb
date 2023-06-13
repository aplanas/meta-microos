SUMMARY = "Development Files for freerdp"
DESCRIPTION = "This package contains development files necessary for developing applications \
based on libfreerdp."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "freerdp-devel-2.10.0-3.1.aarch64.rpm"
RPM_HASH = "7b556463413a763b49051989f2a65e0b8698e6e08c4b60e33b296ffdced5c4ca21e281d2079d54b2ec4e364fd602430d15c4c1d9828a5e4fc6c62bff26d7f468"

RPROVIDES:${PN} += "cmake(FreeRDP) \
cmake(FreeRDP-Client) \
cmake(FreeRDP-Server) \
cmake(FreeRDP-Shadow) \
freerdp-devel \
freerdp-devel(aarch-64) \
pkgconfig(freerdp-client2) \
pkgconfig(freerdp-server2) \
pkgconfig(freerdp-shadow2) \
pkgconfig(freerdp2)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfreerdp2-2 \
pkgconfig(freerdp2) \
pkgconfig(libssl) \
pkgconfig(winpr2) \
winpr-devel"

inherit rpm
