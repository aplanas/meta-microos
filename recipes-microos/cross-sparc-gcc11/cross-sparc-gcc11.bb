SUMMARY = "The GNU Compiler Collection targeting sparcv9"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparcv9. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-sparc-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "fa26a87e2c28c5048150fa0f8a87ccb6864e84c0cdb1ce9ff0d1c4a1837ca72beedd41a6544c80c85f5918b0fd87401907d5ef5926d74a92702ed0d0803417e4"

RPROVIDES:${PN} += "cross-sparc-gcc11 cross-sparc-gcc11(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-sparc-binutils libstdc++6-devel-gcc11 update-alternatives"

inherit rpm
