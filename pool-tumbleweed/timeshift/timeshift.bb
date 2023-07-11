SUMMARY = "System restore utility"
DESCRIPTION = "A system restore utility which takes snapshots of the system at regular \
intervals. These snapshots can be restored at a later date to undo system \
changes. Creates incremental snapshots using rsync or BTRFS snapshots \
using BTRFS tools."
LICENSE = "GPL-3.0-only"

PV = "22.11.2"

RPM_NAME = "timeshift-22.11.2-1.4.aarch64.rpm"
RPM_HASH = "d27b70ceafc7d1ee272dce35317c89691be50811740baefbb259ef0b172c8ae09f5b038c3c26ff6272537fbb5adc3c0cbdf9a4e11d8824577dff90a558c064d0"

RPROVIDES:${PN} += "config-timeshift \
timeshift"

RDEPENDS:${PN} += "/usr/bin/bash \
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
