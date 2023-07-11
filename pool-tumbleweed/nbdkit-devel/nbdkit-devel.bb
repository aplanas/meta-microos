SUMMARY = "Development files and documentation for nbdkit"
DESCRIPTION = "This package contains development files and documentation \
for nbdkit.  Install this package if you want to develop \
plugins for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-devel-1.32.2-1.4.aarch64.rpm"
RPM_HASH = "be96a59c9832fd55fb38d192001824584a308454f7349e8ffb5a4fbc074f9ac725dbb918ebc23f21ba0e448bf1187055ae20787ebfbb5e0bab46ae1693b3092a"

RPROVIDES:${PN} += "nbdkit-devel \
pkgconfig-nbdkit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
nbdkit-server \
pkgconfig"

inherit rpm
