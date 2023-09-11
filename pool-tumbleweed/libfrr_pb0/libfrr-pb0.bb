SUMMARY = "FRRouting protobuf library"
DESCRIPTION = "This library contains protobuf memory management for FRRouting.."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrr_pb0-8.4-5.1.aarch64.rpm"
RPM_HASH = "27d06af3393790f8945ee6a8bbeab47478d5394047cbf28eb6c3178a9f174506d5fafb54faa7f2427adea5e165ec32aaf226dd3ce0f101bb263a65fc82a3d492"

RPROVIDES:${PN} += "libfrr-pb.so.0 \
libfrr-pb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libprotobuf-c.so.1"

inherit rpm
