SUMMARY = "TCTI interface library for Microsoft software TPM2 simulator"
DESCRIPTION = "TPM Command Transmission Interface library for communicating using the \
protocol exposed by the Microsoft software TPM2 simulator."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-tcti-mssim0-4.0.1-2.1.aarch64.rpm"
RPM_HASH = "290030733332d33e3da7d1562e35de1f0b1506bce9be1cbd9191950f68a9fbdf47900ab9441200071acfb871925be352c3d4831a7961d043aec1d3a3e6035868"

RPROVIDES:${PN} += "libtss2-tcti-mssim.so.0 \
libtss2-tcti-mssim0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0"

inherit rpm
