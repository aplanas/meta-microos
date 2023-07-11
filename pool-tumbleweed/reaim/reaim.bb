SUMMARY = "A tool to benchmark overall system performance"
DESCRIPTION = "This tool benchmarks overall system speed by mixing measurements of \
file system speed and execution speed under VM and CPU pressure."
LICENSE = "GPL-2.0-only"

PV = "7.0.1.13"

RPM_NAME = "reaim-7.0.1.13-1.13.aarch64.rpm"
RPM_HASH = "e9744e8f07b4ecf6eda5066020d6cf074b4bdad1ce41435051905dc3da4f5ee9def2d1e6d3745d4bc461633fc866e5b5ada79ad2a17363b4b1ad0cd29d1d0726"

RPROVIDES:${PN} += "reaim"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
