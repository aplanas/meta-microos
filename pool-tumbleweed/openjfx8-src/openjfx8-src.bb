SUMMARY = "OpenJFX Source Bundle"
DESCRIPTION = "OpenJFX Source Bundle."
LICENSE = "BSD-3-Clause & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "8.0.202"

RPM_NAME = "openjfx8-src-8.0.202-8.3.aarch64.rpm"
RPM_HASH = "4171a8c0016a714df89d62414e2ade77b7422f5bf22e368aa25f4d503698ad6fde99591f47724089dfec77802385a4538eea36444881ac610404edf1bf3cc4bc"

RPROVIDES:${PN} += "java-1-8-0-openjfx-src \
openjfx8-src"

RDEPENDS:${PN} += "openjfx8"

inherit rpm
