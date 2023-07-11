SUMMARY = "ZeroMQ Emperor Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains an emperor plugin allowing for configuration of \
applications (vassals) via ZeroMQ."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-emperor_zeromq-2.0.21-3.1.aarch64.rpm"
RPM_HASH = "7fb3d53c5d8b1c3d1d9c0aedc80f472cf2b4abfb45d9b7744eff18a5e21e169df96250e2d988a9988d92b8b133c3d0e7dc2091d8a91115175b238ae271d700fd"

RPROVIDES:${PN} += "uwsgi-emperor-zeromq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzmq.so.5 \
uwsgi"

inherit rpm
