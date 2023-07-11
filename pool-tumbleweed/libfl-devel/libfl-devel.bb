SUMMARY = "Development files for flex"
DESCRIPTION = "FLEX is a tool for generating scanners: programs that recognize lexical \
patterns in text. \
 \
This package contains files required to build programs with flex libraries."
LICENSE = "BSD-3-Clause"

PV = "2.6.4"

RPM_NAME = "libfl-devel-2.6.4-6.21.aarch64.rpm"
RPM_HASH = "bf9557b45a744cd83cd790dd8b504a0ca02a265e46ffe13b18f8943e39f07099bcddaf4b22ae2fb8ff9b7fe7abd79976167c9ad745ac7d7dbc0704a1becd7e12"

RPROVIDES:${PN} += "libfl-devel"

RDEPENDS:${PN} += "libfl2"

inherit rpm
