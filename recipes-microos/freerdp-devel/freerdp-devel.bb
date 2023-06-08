SUMMARY = "Development Files for freerdp"
DESCRIPTION = "This package contains development files necessary for developing applications \
based on libfreerdp."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "freerdp-devel-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "272d790a9423faa597cd11b217a6f1003aa6b70e4c23f9f937a4112b65010db9b248cd1c0092cf84263ccc59c5c789046a326e967bafa107ceb79f3e6c53297b"

RPROVIDES:${PN} += "cmake(FreeRDP) cmake(FreeRDP-Client) cmake(FreeRDP-Server) cmake(FreeRDP-Shadow) freerdp-devel freerdp-devel(aarch-64) pkgconfig(freerdp-client2) pkgconfig(freerdp-server2) pkgconfig(freerdp-shadow2) pkgconfig(freerdp2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libfreerdp2-2 pkgconfig(freerdp2) pkgconfig(libssl) pkgconfig(winpr2) winpr-devel"

inherit rpm
