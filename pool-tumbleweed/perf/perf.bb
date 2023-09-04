SUMMARY = "Performance Monitoring Tools for Linux"
DESCRIPTION = "This package provides a userspace tool 'perf', which monitors performance for \
either unmodified binaries or the entire system. It requires a Linux kernel \
which includes the Performance Counters for Linux (PCL) subsystem (>= 2.6.31). \
This subsystem utilizes the Performance Monitoring Unit (PMU) / hardware \
counters of the underlying cpu architecture (if supported)."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "perf-6.4.11-81.1.aarch64.rpm"
RPM_HASH = "71da6d960f0ce737f7ceef865a5f2427ea7e1d53540fdde49f2f6ca62245594742b94242c2996c0581430bdf917f38ca4aff5486b2178845203d4831040319f5"

RPROVIDES:${PN} += "perf \
perl-Perf--Trace--Context \
perl-Perf--Trace--Core \
perl-Perf--Trace--Util"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbabeltrace-ctf.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libdw.so.1 \
libelf.so.1 \
liblzma.so.5 \
libm.so.6 \
libnuma.so.1 \
libopencsd-c-api.so.1 \
libperl.so \
libpython3.11.so.1.0 \
libslang.so.2 \
libstdc++.so.6 \
libtraceevent.so.1 \
libunwind-aarch64.so.8 \
libunwind.so.8 \
libz.so.1 \
libzstd.so.1 \
perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
