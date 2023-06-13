SUMMARY = "Daemon for automatic killing of login shells"
DESCRIPTION = "KillerD is a simple daemon for automatic killing of login shells with \
idle time exceeding given limits, runaway processes and other system \
hogs. Almost everything can be easily configured."
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "killerd-1.1-126.8.aarch64.rpm"
RPM_HASH = "8368013dbb5b8e13511fd1b104cd221c73e7ecccc5b4042d24ce5bd5fb7b2c01b7e55462f1c583e788f7707d77cd5da5b555ba67aed721e3cb9ccbd04977ef5b"

RPROVIDES:${PN} += "config(killerd) \
killerd \
killerd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
systemd"

inherit rpm
