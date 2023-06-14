SUMMARY = "MIME Mail Handler"
DESCRIPTION = "Metamail is required for reading multimedia mail messages (such as \
those using the Andrew toolkit) with elm."
LICENSE = "GPL-2.0-only & MIT"

PV = "2.7.19"

RPM_NAME = "metamail-2.7.19-1274.4.aarch64.rpm"
RPM_HASH = "1161fae516bc160d96bd5d5d4e8651776d4a97fa4a9ec0a8dbc38fd1c7ecbc04884874a3944e494792567ab735c8b297c5c9506f9d05e5b8aa5a2649eff8df65"

RPROVIDES:${PN} += "metamail"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpipeline.so.1 \
libtinfo.so.6 \
sharutils"

inherit rpm
