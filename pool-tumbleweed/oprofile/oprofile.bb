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

RPM_NAME = "oprofile-1.4.0-2.2.aarch64.rpm"
RPM_HASH = "938aab297869ba1fd28069f0a90fd0a4d736e8ce3ebcd3ffe64365a80f039f1cf52c53a67ec9a05fe5758d56a664638d7a8e21376645f172e7b8ab7888e3ad73"

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
