SUMMARY = "Go compiled shared library libstd.so"
DESCRIPTION = "Go standard library compiled to a dynamically loadable shared object libstd.so"
LICENSE = "BSD-3-Clause"

PV = "1.18.10"

RPM_NAME = "go1.18-libstd-1.18.10-4.1.aarch64.rpm"
RPM_HASH = "10150f220b918cbb6012a57ac01e88f48094d892973924eab224020eeeebdc2ce12913dbc2fb29b4e361262048c81376e61d0cc30082971ac212ef9ac7757c27"

RPROVIDES:${PN} += "go-libstd \
go1.18-libstd \
libstd.so"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
