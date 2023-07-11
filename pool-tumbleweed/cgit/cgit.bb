SUMMARY = "A web frontend for git repositories"
DESCRIPTION = "A web interface for the Git SCM, using a built-in cache to decrease server \
I/O pressure."
LICENSE = "GPL-2.0"

PV = "1.2.3"

RPM_NAME = "cgit-1.2.3-1.17.aarch64.rpm"
RPM_HASH = "3ded670fdd88346157d9ad82d10085853ecaca6adb8ef8cd42afe0eeda7018db7355cfc98c410592acca0a7f45b65c4e0d26b70de5842486464c8db70a95c834"

RPROVIDES:${PN} += "bundled-git \
cgit \
config-cgit"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
