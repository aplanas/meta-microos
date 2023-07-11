SUMMARY = "The X Protocol"
DESCRIPTION = "The pthread-stubs for X development"
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "pthread-stubs-devel-0.4-1.16.aarch64.rpm"
RPM_HASH = "1d43482dc8e8d332aabd4dcbb431355e6486c3f4a71021dc2e7b44c22626d51b8a90491ac38a672095be711c38acea62a20716f5091a021a09d59b735d2bd0c2"

RPROVIDES:${PN} += "pkgconfig-pthread-stubs \
pthread-stubs-devel \
xorg-x11-proto-devel-//usr/lib64/pkgconfig/pthread-stubs.pc"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
