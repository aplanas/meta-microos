SUMMARY = "Linux Trace Toolkit Userspace Tracer Python 3 agent"
DESCRIPTION = "This library may be used by user space applications to generate \
tracepoints within the kernel LTT subsystem. \
 \
This package provides the LLTng-UST Python 3 agent."
LICENSE = "GPL-2.0-only"

PV = "2.13.5"

RPM_NAME = "python3-lttngust-2.13.5-1.4.aarch64.rpm"
RPM_HASH = "0ab7f21abd4de2804498cdb3b66eaa7507258d575b2b433bfc6c0060dff41cbb3f6716a5ec6bce8a0301ddfa6abb4c66b72d54da4556042e14441c6d0a39cf04"

RPROVIDES:${PN} += "python3-lttngust \
python3.11dist-lttngust \
python3dist-lttngust"

RDEPENDS:${PN} += "liblttng-ust-python-agent1 \
python-abi"

inherit rpm
