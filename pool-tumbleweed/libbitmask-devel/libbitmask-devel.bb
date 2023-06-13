SUMMARY = "Multi-word bitmask abstract data type (used by cpusets)"
DESCRIPTION = "The Cpuset System is a processor and memory placement mechanism that \
The libbitmask package provides an abstract data type for arbitrary \
length bit masks, with a variety of operators.	The cpuset package \
depends on libbitmask."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0"

RPM_NAME = "libbitmask-devel-2.0-29.7.aarch64.rpm"
RPM_HASH = "2dcb0efaf8efc3ab44b9acce078330b3636ed5807dd45f59ca7ad8257377a9d4888fc1f04f85f49e1b96a899b1d73afe87597f65bbb63d7637ca1445840bf0c2"

RPROVIDES:${PN} += "libbitmask-devel \
libbitmask-devel(aarch-64)"

RDEPENDS:${PN} += "libbitmask1"

inherit rpm
