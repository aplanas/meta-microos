SUMMARY = "Development files for oprofile, a system-wide profiler for Linux"
DESCRIPTION = "OProfile is a system-wide profiler for Linux systems, capable of \
profiling all running code at low overhead. OProfile is released under \
the GNU GPL. \
 \
This package contains the files needed to develop JIT agents for other \
virtual machines."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "oprofile-devel-1.4.0-2.2.aarch64.rpm"
RPM_HASH = "4db2d4e810c1261a27986df5d8882dc6b428adf28b6282fb457fde77a66f25c0718efad40828408aa92e416c508924553818b8f914bf579dd7c6c612580a3f9a"

RPROVIDES:${PN} += "oprofile-devel"

RDEPENDS:${PN} += "binutils-devel \
libopagent1"

inherit rpm
