SUMMARY = "Configuration tool for Ftrace"
DESCRIPTION = "trace-cmd is a command-line tool for configuring Ftrace."
LICENSE = "GPL-2.0-only"

PV = "3.1.6"

RPM_NAME = "trace-cmd-3.1.6-1.3.aarch64.rpm"
RPM_HASH = "667f689ced32422c776ab2c52186b71b2eb2f19fe36d6b0f6e6d63815b915fd77870b0446d7661cd71adead8b6248abec326863537c33074ab3d93401f2dbf03"

RPROVIDES:${PN} += "trace-cmd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtraceevent.so.1 \
libtracefs.so.1"

inherit rpm
