SUMMARY = "Pic language processor"
DESCRIPTION = "Pic language processor for LaTeX documents or web sites."
LICENSE = "BSD-2-Clause & CC-BY-3.0"

PV = "2023.02.01"

RPM_NAME = "dpic-2023.02.01-1.3.aarch64.rpm"
RPM_HASH = "73ad7300402a08ce8710f89c2ba0e85356fce6d9df4ccd6357ed4a9911adb399cc92bb62b7404c832e9bbf24eb231911a62ea23adc4a0579d5da554e588683dc"

RPROVIDES:${PN} += "dpic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
