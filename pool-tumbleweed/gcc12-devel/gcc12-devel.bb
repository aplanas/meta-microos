SUMMARY = "GCC plugins development enviroment"
DESCRIPTION = "Files required for developing and compiling GCC plugins."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-devel-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "d3ac9123024dfbd9e77db4b623cf1981b049125aca656e65a22d95ac33f31f1d1c08d0f11775ac483bdab5d985fc3d3df0a8a40426d0e594e4ce9466b2808625"

RPROVIDES:${PN} += "gcc12-devel"

RDEPENDS:${PN} += "gcc12 \
gmp-devel \
libc.so.6 \
mpc-devel"

inherit rpm
