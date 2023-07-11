SUMMARY = "GNU make"
DESCRIPTION = "The GNU make command with extensive documentation."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.1"

RPM_NAME = "make-4.4.1-2.3.aarch64.rpm"
RPM_HASH = "29323b74808ba93870162ea767ca1cac610245b81fe75c7c64c59bd2646a6088dd3f854ef5af6e592af0185c3a8b4943331fe88cfc56f43d555cb5c9ca5b9b24"

RPROVIDES:${PN} += "gmake \
make"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
