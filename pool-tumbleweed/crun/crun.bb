SUMMARY = "OCI runtime written in C"
DESCRIPTION = "crun is a runtime for running OCI containers. It is built with libkrun support"
LICENSE = "GPL-2.0-or-later"

PV = "1.8.5"

RPM_NAME = "crun-1.8.5-1.1.aarch64.rpm"
RPM_HASH = "b7bad3a16ffd97df4adb438e0b20bbcccda44fa563d0f239ca2ea2941ac7de7b4e63e1f28a2a5e5894953c024642e7ec31e2c018efb1f77a1b56add323688109"

RPROVIDES:${PN} += "crun"

RDEPENDS:${PN} += "libc.so.6 \
libcap.so.2 \
libkrun1 \
libseccomp.so.2 \
libsystemd.so.0 \
libyajl.so.2"

inherit rpm
