SUMMARY = "Bootstrap-daemon for toxcore"
DESCRIPTION = "Bootstrap-daemon to dispose hashtable for toxcore."
LICENSE = "GPL-3.0-only"

PV = "0.2.18"

RPM_NAME = "c-toxcore-daemon-0.2.18-1.5.aarch64.rpm"
RPM_HASH = "dd6f6ee352e0eab5bb45142fe42e312afdbfebefd4a2eb7be9154dc89c1323d7653f657c3d85bc982c3d16f0367be7a8a9444e9745f9af34d213c618b4039841"

RPROVIDES:${PN} += "c-toxcore-daemon \
config-c-toxcore-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libconfig.so.11 \
libsodium.so.23 \
libtoxcore.so.2"

inherit rpm
