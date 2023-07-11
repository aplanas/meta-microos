SUMMARY = "Configuration tool for Ftrace"
DESCRIPTION = "trace-cmd is a command-line tool for configuring Ftrace."
LICENSE = "GPL-2.0-only"

PV = "3.2"

RPM_NAME = "trace-cmd-3.2-1.1.aarch64.rpm"
RPM_HASH = "db6404c62a5ec15789d345e48a57bf125139ac6c2e869caa6da686bfc7b8342fa7c5765583ffd3e4aa1adf0b56d873331f91ddd6e46090941291922048364fb3"

RPROVIDES:${PN} += "trace-cmd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtraceevent.so.1 \
libtracefs.so.1"

inherit rpm
