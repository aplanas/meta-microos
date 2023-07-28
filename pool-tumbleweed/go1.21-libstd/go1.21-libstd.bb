SUMMARY = "Go compiled shared library libstd.so"
DESCRIPTION = "Go standard library compiled to a dynamically loadable shared object libstd.so"
LICENSE = "BSD-3-Clause"

PV = "1.21rc3"

RPM_NAME = "go1.21-libstd-1.21rc3-1.1.aarch64.rpm"
RPM_HASH = "5151daf9b3a4a5fe1789259e99618036e240bd85c9e9d8f4cc73d8112c9edabc20864a4b52f410a8eed638078c7ca305c004052088cceb4ffeff8d1890514b5f"

RPROVIDES:${PN} += "go-libstd \
go1.21-libstd \
libstd.so"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
