SUMMARY = "SvxLink Async development files"
DESCRIPTION = "The Async library development files"
LICENSE = "GPL-2.0-only"

PV = "1.4.0"

RPM_NAME = "libasync-devel-1.4.0-5.10.aarch64.rpm"
RPM_HASH = "29025288024fceae4c575ccb3780370732e22f7541a9ade57fab2cbe5d2737b149683a4e9f1dd3fab3180d333017297969339da64c4b2f2dfaf8d09cdbde57c9"

RPROVIDES:${PN} += "libasync-devel"

RDEPENDS:${PN} += "libasync1-6"

inherit rpm
