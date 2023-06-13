SUMMARY = "System restore utility"
DESCRIPTION = "A system restore utility which takes snapshots of the system at regular \
intervals. These snapshots can be restored at a later date to undo system \
changes. Creates incremental snapshots using rsync or BTRFS snapshots \
using BTRFS tools."
LICENSE = "GPL-3.0-only"

PV = "22.11.2"

RPM_NAME = "timeshift-22.11.2-1.3.aarch64.rpm"
RPM_HASH = "8ac2fa91672bc78f5ee7f96ef2673d4077f431dfe23af444520805d43087ea44eb0ad727f2c97b9c5ec486c26e6e35ccb91fcd42267f2a23b6757e9483c7060a"

RPROVIDES:${PN} += "application() \
application(timeshift-gtk.desktop) \
config(timeshift) \
metainfo() \
metainfo(timeshift.appdata.xml) \
timeshift \
timeshift(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libvte-2.91.so.0()(64bit) \
rsync"

inherit rpm
