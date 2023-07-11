SUMMARY = "Command line interface for libeconf"
DESCRIPTION = "This package contains tools for handling configuration files in e.g. /usr/etc \
and /etc."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.2"

RPM_NAME = "libeconf-utils-0.5.2-1.4.aarch64.rpm"
RPM_HASH = "0f490b742da17ccf665929878b972b5ef42828047e41141b31fd6bdabb4f1b5de5c1d6953ddd7e543773598a6a962ba0131056e01c14384cbfe4b9d406dce383"

RPROVIDES:${PN} += "libeconf-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libeconf.so.0 \
libeconf0"

inherit rpm
