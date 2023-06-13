SUMMARY = "HDHomeRun library"
DESCRIPTION = "Development libraries needed to build applications with libhdhomerun."
LICENSE = "LGPL-2.1-only"

PV = "20190621"

RPM_NAME = "libhdhomerun-devel-20190621-1.18.aarch64.rpm"
RPM_HASH = "2ad132cdaf8dcfc844514987ddc3f00c02c825f260956bd307d4ccc983cbdba7bc588e0aa0b66b8d15a707767712fc188e6db799e3ba8259935d1f3f0a3054c2"

RPROVIDES:${PN} += "libhdhomerun-devel \
libhdhomerun-devel(aarch-64) \
libhdhomerun:/usr/include/libhdhomerun/hdhomerun.h"

RDEPENDS:${PN} += "libhdhomerun2"

inherit rpm
