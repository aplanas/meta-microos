SUMMARY = "OCI runtime written in C"
DESCRIPTION = "crun is a runtime for running OCI containers. It is built with libkrun support"
LICENSE = "GPL-2.0-or-later"

PV = "1.8.6"

RPM_NAME = "crun-1.8.6-2.1.aarch64.rpm"
RPM_HASH = "81dbae1f66fdeee9eeb85516b30208a92e866dfe36fa46c72b88d5ab1ade6f687b967b6222e522b8b85497e7f847015e299b262677edc6f05761f7da9ec74dba"

RPROVIDES:${PN} += "crun"

RDEPENDS:${PN} += "libc.so.6 \
libcap.so.2 \
libkrun1 \
libseccomp.so.2 \
libsystemd.so.0 \
libyajl.so.2"

inherit rpm
