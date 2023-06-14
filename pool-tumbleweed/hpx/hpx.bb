SUMMARY = "General Purpose C++ Runtime System"
DESCRIPTION = "HPX is a general purpose C++ runtime system for parallel and distributed applications of any scale."
LICENSE = "BSL-1.0"

PV = "1.8.1"

RPM_NAME = "hpx-1.8.1-2.2.aarch64.rpm"
RPM_HASH = "08f067e2bf3f4f9021e65d5be662c0f99c334e2a4e521584cfc664404b304dfa9ff0558095106c5f01a78a0f400ba0e89c747a77332cabbed04b533acf310dac"

RPROVIDES:${PN} += "hpx"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
libhpx1"

inherit rpm
