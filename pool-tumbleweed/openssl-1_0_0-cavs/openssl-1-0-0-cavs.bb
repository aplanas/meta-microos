SUMMARY = "CAVS testing framework and utilities"
DESCRIPTION = "Includes the Composite Application Validation System (CAVS) \
testing framework and utilities."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "openssl-1_0_0-cavs-1.0.2u-22.1.aarch64.rpm"
RPM_HASH = "428ac42724a27546b19dad02179596ef6fe34a3ddd6c04eddf5cf090919ff21f078f1033a2ffc277a5fa1a39d0b7bda2795c5c8a4863754dfa3045d110f1d39f"

RPROVIDES:${PN} += "openssl-1-0-0-cavs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libopenssl1-0-0 \
libz.so.1"

inherit rpm
