SUMMARY = "Utility library for cmpi development"
DESCRIPTION = "A set of utility functions that make cmpi provider development easier"
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "libsblim-cmpiutil1-1.0.1-24.25.aarch64.rpm"
RPM_HASH = "91d03510eb144228b5c105cecdeb0e293c803800148ed4c4572b5fd1b5a2433005a196abbfe07b4520857961020718934e458e6f4d99a994ab5859034dff7c62"

RPROVIDES:${PN} += "libsblim-cmpiutil.so.1 \
libsblim-cmpiutil1 \
sblim-cmpiutil"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
