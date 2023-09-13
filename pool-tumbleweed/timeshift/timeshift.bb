SUMMARY = "System restore utility"
DESCRIPTION = "A system restore utility which takes snapshots of the system at regular \
intervals. These snapshots can be restored at a later date to undo system \
changes. Creates incremental snapshots using rsync or BTRFS snapshots \
using BTRFS tools."
LICENSE = "GPL-3.0-only"

PV = "23.07.1"

RPM_NAME = "timeshift-23.07.1-1.1.aarch64.rpm"
RPM_HASH = "43140b8d4013422cdfee66454b006f5759458c56efb21440b6d5a6cd41da56146e174c2845b3223bb149c2a13eded9f9dfa97e4fe877f07e783baf4c07039528"

RPROVIDES:${PN} += "config-timeshift \
timeshift"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libvte-2.91.so.0 \
rsync"

inherit rpm
