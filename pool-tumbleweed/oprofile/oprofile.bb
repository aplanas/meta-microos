SUMMARY = "System-Wide Profiler for Linux Systems"
DESCRIPTION = "OProfile is a system-wide profiler for Linux systems, capable of \
profiling all running code at low overhead. OProfile is released under \
the GNU GPL. \
 \
It consists of a kernel module and a daemon for collecting sample data, \
and several post-profiling tools for turning data into information. \
 \
OProfile leverages the CPU hardware performance counters to enable \
profiling of a wide variety of interesting statistics, which can also \
be used for basic time-spent profiling. All code is profiled: hardware \
and software interrupt handlers, kernel modules, the kernel, shared \
libraries, and applications (the only exception being the oprofile \
interrupt handler itself). \
 \
OProfile is currently in alpha status; however it has proven stable \
over a large number of differing configurations. As always, there is no \
warranty. \
 \
This is the package containing the userspace tools."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "oprofile-1.4.0-2.1.aarch64.rpm"
RPM_HASH = "4505ea2b241ac1453b464785cd0e177b405c1586343b485213b0469834b60e9aae06ff58782fab1437265fb52d9d52ef7453252985775f5abce915898ff5c04a"

RPROVIDES:${PN} += "libjvmpi_oprofile.so()(64bit) \
libjvmti_oprofile.so()(64bit) \
oprofile \
oprofile(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libopagent.so.1()(64bit) \
libopagent.so.1(OPAGENT_1.0)(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libsframe.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
