SUMMARY = "Plugins for the Linux kernel trace event library"
DESCRIPTION = "This package provides plugins for the libtraceevent library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.7.3"

RPM_NAME = "libtraceevent1-plugins-1.7.3-1.1.aarch64.rpm"
RPM_HASH = "881c44dd761ba6c503aad6c561ef4511c63d0f76d57998ea8cb99f24fc6875db5c48a24b6c67ccf9645f0db58f397460241607bf0ff3b507660cb5d92e867a77"

RPROVIDES:${PN} += "libtraceevent1-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtraceevent.so.1 \
libtraceevent1"

inherit rpm
