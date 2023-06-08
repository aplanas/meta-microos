SUMMARY = "Remote Desktop Server"
DESCRIPTION = "This package contains a server-side implementation which can export a desktop \
via the Remote Desktop Protocol (RDP) following the Microsoft Open \
Specifications."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "freerdp-server-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "a10129b44799493c1e06149f9db5d6699a8827673f335e72127d7ab517f9856846234612b6e8e13c463e677cfd49d8b7fd2c3d6b220e7105870047c16413c07d"

RPROVIDES:${PN} += "freerdp-server freerdp-server(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreerdp-shadow-subsystem2.so.2()(64bit) libfreerdp-shadow2.so.2()(64bit) libwinpr-tools2.so.2()(64bit) libwinpr2.so.2()(64bit)"

inherit rpm
