SUMMARY = "Development files for libserd"
DESCRIPTION = "Development files for libserd."
LICENSE = "ISC"

PV = "0.30.16"

RPM_NAME = "serd-devel-0.30.16-1.2.aarch64.rpm"
RPM_HASH = "c534123464341b06aa08fdd91f0e3a94fd03e675b333285cb8030ca8ba923ec37decafadcd7a08067b928a6f4abf6a0996d38cd7e381d2ac2eed172ac13d4fea"

RPROVIDES:${PN} += "libserd-0-devel \
pkgconfig-serd-0 \
serd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libserd-0-0"

inherit rpm
