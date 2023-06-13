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
perf(aarch-64) \
perl(Perf::Trace::Context) \
perl(Perf::Trace::Core) \
perl(Perf::Trace::Util)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libbabeltrace-ctf.so.1()(64bit) \
libc.so.6()(64bit) \
libcap.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libdebuginfod.so.1()(64bit) \
libdw.so.1()(64bit) \
libelf.so.1()(64bit) \
liblzma.so.5()(64bit) \
libm.so.6()(64bit) \
libnuma.so.1()(64bit) \
libopencsd_c_api.so.1()(64bit) \
libperl.so()(64bit) \
libpython3.10.so.1.0()(64bit) \
libslang.so.2()(64bit) \
libslang.so.2(SLANG2)(64bit) \
libtraceevent.so.1()(64bit) \
libunwind-aarch64.so.8()(64bit) \
libunwind.so.8()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit) \
perl \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
