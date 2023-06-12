SUMMARY = "Moderately-optimizing Brainfuck interpreter"
DESCRIPTION = "Moderately-optimizing (tm) Brainfuck interpreter"
LICENSE = "BSD-3-Clause"

PV = "1.0.7"

RPM_NAME = "bff-1.0.7-1.2.aarch64.rpm"
RPM_HASH = "493c1c4b1d4aa202499d05f9f8e670ac8de5dda462f628f2c3cfa801ad159dc7650fe3810f42eb51099d2a4bf519e6a24dbccc8ea79817a693a0e651900b56d3"

RPROVIDES:${PN} += "bff \
bff(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
