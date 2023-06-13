SUMMARY = "Python bindings for libpfm and perf_event_open system call"
DESCRIPTION = "This package provides python bindings for the libpfm4 package and the perf_event_open system call."
LICENSE = "MIT"

PV = "4.13.0"

RPM_NAME = "python310-libpfm-4.13.0-1.1.aarch64.rpm"
RPM_HASH = "7fcaaa1538225444bc664d4b44c2c5c94a70eefb47ecafc00ab2ba2b8db7d124f0c9c869a08c2088b6149b08120293822fd3a9b80927b6c6d6653ececbf79073"

RPROVIDES:${PN} += "python3-libpfm \
python3.10dist(perfmon) \
python310-libpfm \
python310-libpfm(aarch-64) \
python3dist(perfmon)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpfm.so.4()(64bit) \
libpfm4 \
python(abi)"

inherit rpm
