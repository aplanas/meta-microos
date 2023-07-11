SUMMARY = "FRRouting protobuf library"
DESCRIPTION = "This library contains protobuf memory management for FRRouting.."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrr_pb0-8.4-4.2.aarch64.rpm"
RPM_HASH = "cb2e5da65460d526adfbd3a79c4637cfa6706d225634c8a6e1e86b46f1b739ab3f389c54eb7365e0fde50168b5ae74797c78b6123c8709188d1e0fa792d91b1e"

RPROVIDES:${PN} += "libfrr-pb.so.0 \
libfrr-pb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libprotobuf-c.so.1"

inherit rpm
