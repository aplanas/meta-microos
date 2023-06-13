SUMMARY = "Development files for levmar library, and demo program"
DESCRIPTION = "Development files for the levmar library, and demo program."
LICENSE = "GPL-2.0-or-later"

PV = "2.6"

RPM_NAME = "levmar-devel-2.6-2.3.aarch64.rpm"
RPM_HASH = "d249b8c88bb8fb5fa53f8bb45f4e5aed290a7993ec8a4ae984138eec0fe728899dd0acb0212b3c206ad6e55a81485acf99757b55cbff7a23932c579b2937836e"

RPROVIDES:${PN} += "levmar-devel \
levmar-devel(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liblevmar.so.2()(64bit) \
liblevmar2 \
libm.so.6()(64bit)"

inherit rpm
