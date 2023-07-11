SUMMARY = "Utility for listing and reaping zombie processes"
DESCRIPTION = "zps aims to list the running processes at a particular time with stats and indicate \
the zombie processes on this list. It can also reap these zombie processes automatically \
if `--reap` argument is provided. There's also `--lreap` argument for reaping zombie \
processes after listing."
LICENSE = "GPL-3.0-only"

PV = "1.2.8"

RPM_NAME = "zps-1.2.8-1.4.aarch64.rpm"
RPM_HASH = "56f421e7675f7c963c608a9e5482321b5269c65baf7ddf3096aa784e5b3e0ee774553b4390f373a4119b4406f1bda3b666c3e2530f8d7d1b952e59abe5763af0"

RPROVIDES:${PN} += "zps"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
