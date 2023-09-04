SUMMARY = "Low Complexity Communication Codec (LC3) - Tools"
DESCRIPTION = "Low Complexity Communication Codec (LC3). \
The LC3 is an low latency audio codec. \
 \
This package provides tools for liblc3."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "liblc3-tools-1.0.4-1.1.aarch64.rpm"
RPM_HASH = "7c2dd281220f8932ee3e4d98a8acf6cdaa7700d97f0163173608551d89070bca9c126ec8ee6091e27acd3d6f4e1f4173d3c31a4ba8658cb71c6895553309f354"

RPROVIDES:${PN} += "liblc3-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblc3.so.1"

inherit rpm
