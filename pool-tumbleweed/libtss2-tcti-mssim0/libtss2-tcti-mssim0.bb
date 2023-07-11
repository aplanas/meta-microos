SUMMARY = "TCTI interface library for Microsoft software TPM2 simulator"
DESCRIPTION = "TPM Command Transmission Interface library for communicating using the \
protocol exposed by the Microsoft software TPM2 simulator."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-tcti-mssim0-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "30ba8d3270beb9dce2b860606181a3982002ce7f8b3c63841c90a85c2f2c9ed2b15fd1fc03400530bb7410234aa1df6914d019cb93cd27e766fda60ab5b7c629"

RPROVIDES:${PN} += "libtss2-tcti-mssim.so.0 \
libtss2-tcti-mssim0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0"

inherit rpm
