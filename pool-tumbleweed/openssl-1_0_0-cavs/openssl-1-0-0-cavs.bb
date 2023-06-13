SUMMARY = "CAVS testing framework and utilities"
DESCRIPTION = "Includes the Composite Application Validation System (CAVS) \
testing framework and utilities."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "openssl-1_0_0-cavs-1.0.2u-16.1.aarch64.rpm"
RPM_HASH = "e2285bddcb10243d10bf143e6e8bbde7862e03855e27910a240849722d7195dceba7d72aa5ed24326596c8d160505f10f056e7a7ba63a6063a3d7a1850c3d844"

RPROVIDES:${PN} += "openssl-1_0_0-cavs \
openssl-1_0_0-cavs(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libopenssl1_0_0 \
libz.so.1()(64bit)"

inherit rpm
