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

RPROVIDES:${PN} += "libjvmpi-oprofile.so \
libjvmti-oprofile.so \
oprofile"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopagent.so.1 \
libpopt.so.0 \
libsframe.so.0 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
