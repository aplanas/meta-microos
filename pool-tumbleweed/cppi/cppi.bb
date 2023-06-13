SUMMARY = "C preprocessor directive indenter"
DESCRIPTION = "cppi indents the C preprocessor directives to reflect their nesting and ensures \
that there is exactly one space character between each #if, #elif, #define \
directive and the following token."
LICENSE = "GPL-3.0+"

PV = "1.18"

RPM_NAME = "cppi-1.18-2.25.aarch64.rpm"
RPM_HASH = "95afed91d69c9a2874281b8ec2293e248ffea3079a25bd603c6a68570ef743c9308f9a431d6ae8a523817b8a8f0a59e15d1418f1fafd073522e0618d5a0d57c0"

RPROVIDES:${PN} += "cppi \
cppi(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
