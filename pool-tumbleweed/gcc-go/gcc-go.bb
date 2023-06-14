SUMMARY = "The system GNU Go Compiler"
DESCRIPTION = "The system GNU Go Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "gcc-go-13-1.3.aarch64.rpm"
RPM_HASH = "8f25a2ed47945b8ff9106f3d6170309a2e6035ad3dc05e35daee894b78db1cf5125efef61381285fdad2b864c913bf9e532fdec8c7bdebcdf686724f103ddb95"

RPROVIDES:${PN} += "gcc-go"

RDEPENDS:${PN} += "/bin/sh \
gcc \
gcc13-go \
update-alternatives"

inherit rpm
