SUMMARY = "Performance Monitoring Tools for Linux"
DESCRIPTION = "This package provides a userspace tool 'perf', which monitors performance for \
either unmodified binaries or the entire system. It requires a Linux kernel \
which includes the Performance Counters for Linux (PCL) subsystem (>= 2.6.31). \
This subsystem utilizes the Performance Monitoring Unit (PMU) / hardware \
counters of the underlying cpu architecture (if supported)."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "perf-6.4.2-80.9.aarch64.rpm"
RPM_HASH = "3ec73302c2408fbca52fac14527b9f7ff02521dd9ae01d76d42c6c648353bcbd8c81ed9b7a69b0eecf0187a690111d1789ca9f70b064737dd5b4935e176bc3d8"

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
libdebuginfod.so.1 \
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
perl--MODULE-COMPAT-5.36.1"

inherit rpm
