SUMMARY = "RADOS object class development kit"
DESCRIPTION = "This package contains libraries and headers needed to develop RADOS object \
class plugins."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "rados-objclass-devel-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "aff130370d2de73411cdb1787f7ccb03b5a1927ffce60171b905aef7585bd236aeb6ad6291971fdf209d63c1e30cd08df5f6557a3d991c86e6d3028b7d16548d"

RPROVIDES:${PN} += "rados-objclass-devel \
rados-objclass-devel(aarch-64)"
RDEPENDS:${PN} += "libradospp-devel"

inherit rpm
