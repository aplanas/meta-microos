SUMMARY = "Performance Monitoring Tools for Linux"
DESCRIPTION = "This package provides a userspace tool 'perf', which monitors performance for \
either unmodified binaries or the entire system. It requires a Linux kernel \
which includes the Performance Counters for Linux (PCL) subsystem (>= 2.6.31). \
This subsystem utilizes the Performance Monitoring Unit (PMU) / hardware \
counters of the underlying cpu architecture (if supported)."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "perf-6.3.4-80.3.aarch64.rpm"
RPM_HASH = "ddfe28d848be86ffabbefb91e47a600b91e2389bdeb8e448297dc4fa07a77ad58b2d390ecb3fb9c6a610810b56f651eefab48ca454ca7fde3b17b9eff299e9b8"

RPROVIDES:${PN} += "perf \
perl-Perf--Trace--Context \
perl-Perf--Trace--Core \
perl-Perf--Trace--Util"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
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
libpython3.10.so.1.0 \
libslang.so.2 \
libtraceevent.so.1 \
libunwind-aarch64.so.8 \
libunwind.so.8 \
libz.so.1 \
libzstd.so.1 \
perl \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
