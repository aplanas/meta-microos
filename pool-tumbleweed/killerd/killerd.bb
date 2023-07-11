SUMMARY = "Daemon for automatic killing of login shells"
DESCRIPTION = "KillerD is a simple daemon for automatic killing of login shells with \
idle time exceeding given limits, runaway processes and other system \
hogs. Almost everything can be easily configured."
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "killerd-1.1-126.9.aarch64.rpm"
RPM_HASH = "8e94d8b6c4047bd3302179c6efe20e468360e2d7abe2c5da1d30c8f6ed27aad1b4327d483feec85ca0cfe3a105759cc7bdd52e22e38448fabef664025a0d3fb9"

RPROVIDES:${PN} += "config-killerd \
killerd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
