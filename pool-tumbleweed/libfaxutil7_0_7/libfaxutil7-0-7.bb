SUMMARY = "Runtime library needed by both fax server and client"
DESCRIPTION = "This runtime lib is needed by both the fax server and the client."
LICENSE = "BSD-3-Clause"

PV = "7.0.7"

RPM_NAME = "libfaxutil7_0_7-7.0.7-1.6.aarch64.rpm"
RPM_HASH = "0ea8be3230b2135655989a26298ac3d04e5e78f6877750af50453f0715104cb3b2193406c4c32257429116e623a634b02c6e6f20e3cd8978be282dc3540af4b7"

RPROVIDES:${PN} += "libfaxutil.so.7.0.7 \
libfaxutil7-0-7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1"

inherit rpm
