SUMMARY = "Performance Monitoring Tools for Linux"
DESCRIPTION = "This package provides a userspace tool 'perf', which monitors performance for \
either unmodified binaries or the entire system. It requires a Linux kernel \
which includes the Performance Counters for Linux (PCL) subsystem (>= 2.6.31). \
This subsystem utilizes the Performance Monitoring Unit (PMU) / hardware \
counters of the underlying cpu architecture (if supported)."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "perf-6.4.12-81.2.aarch64.rpm"
RPM_HASH = "0c203c1e7639446a6225c49298fcd356a5d1de4e2ab84c5703f974db4c38f51708fadee78252cdb8fb432b11c4328a518e87fa9c8b046228f290ddaff74c21b1"

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
