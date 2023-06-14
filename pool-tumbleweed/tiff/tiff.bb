SUMMARY = "Tools for Converting from and to the Tagged Image File Format"
DESCRIPTION = "This package contains the library and support programs for the TIFF \
image format."
LICENSE = "HPND"

PV = "4.5.0"

RPM_NAME = "tiff-4.5.0-3.3.aarch64.rpm"
RPM_HASH = "ab105f55b496fc60f1f5771b525c382444ed8853ebd765cd009166b42c4aececf93a62fd4073188a432e399b422db19e5a93fe3ecbd2f8fda94ceffaff9deeae"

RPROVIDES:${PN} += "tiff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libtiff.so.6"

inherit rpm
