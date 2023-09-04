SUMMARY = "OCI runtime written in C"
DESCRIPTION = "crun is a runtime for running OCI containers. It is built with libkrun support"
LICENSE = "GPL-2.0-or-later"

PV = "1.8.6"

RPM_NAME = "crun-1.8.6-1.1.aarch64.rpm"
RPM_HASH = "5f18a371d2a6cc74e320b4941ee81b3ae2035af25055de8d219cd65daf8fb4afccadadcb9f77e6ff485f33db1689c56efa8ead66fc5a0bc46e6285113f125a2d"

RPROVIDES:${PN} += "crun"

RDEPENDS:${PN} += "libc.so.6 \
libcap.so.2 \
libkrun1 \
libseccomp.so.2 \
libsystemd.so.0 \
libyajl.so.2"

inherit rpm
