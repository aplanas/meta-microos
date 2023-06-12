SUMMARY = "Python bindings for libpfm and perf_event_open system call"
DESCRIPTION = "This package provides python bindings for the libpfm4 package and the perf_event_open system call."
LICENSE = "MIT"

PV = "4.13.0"

RPM_NAME = "python311-libpfm-4.13.0-1.1.aarch64.rpm"
RPM_HASH = "e7990bc4470c9a312f5916bf6b0b3504ba39ea0cd999c89c23b68eee4f2bc00083d079d00e7a902b20931dedb41ca692342ee9a716e7ea894376a18fb3e7e5f8"

RPROVIDES:${PN} += "python3.11dist(perfmon) \
python311-libpfm \
python311-libpfm(aarch-64) \
python3dist(perfmon)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpfm.so.4()(64bit) \
libpfm4 \
python(abi)"

inherit rpm
