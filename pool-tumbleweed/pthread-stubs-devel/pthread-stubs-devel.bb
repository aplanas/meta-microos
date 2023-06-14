SUMMARY = "The X Protocol"
DESCRIPTION = "The pthread-stubs for X development"
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "pthread-stubs-devel-0.4-1.15.aarch64.rpm"
RPM_HASH = "74ff94a5d29839392ec0bd2806961df8b51174cc606c885342570147e4476cfd528cca1519ae0ac1c9e6eb4ed4280f0f74843bab394f1982505e16a7b64fea41"

RPROVIDES:${PN} += "pkgconfig-pthread-stubs \
pthread-stubs-devel \
xorg-x11-proto-devel-//usr/lib64/pkgconfig/pthread-stubs.pc"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
