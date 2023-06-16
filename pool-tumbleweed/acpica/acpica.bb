SUMMARY = "A set of tools to display and debug BIOS ACPI tables"
DESCRIPTION = "The included tools share the same code as it is used in the ACPI \
implementation of the kernel. The code of the acpica project is exactly \
the same as the ACPI parser and interpreter code of the kernel and the \
code gets synced regularly from the acpica project into the kernel. \
E.g. if you identify bugs in the kernel's ACPI implementation it might \
be easier to debug them in userspace if possible. If the bug is part of \
the acpica code, it has to be submitted to the acpica project to get \
merged into the mainline kernel sources. \
 \
iasl compiles ASL (ACPI Source Language) into AML (ACPI Machine \
Language). This AML is suitable for inclusion as a DSDT in system \
firmware. It also can disassemble AML, for debugging purposes."
LICENSE = "GPL-2.0-only"

PV = "20221020"

RPM_NAME = "acpica-20221020-1.3.aarch64.rpm"
RPM_HASH = "b4a336590dc6b9d0b83f57130829936c34e0101bf298b2996e8c0844f9b0e3dec69c1f53e3959e4252b66feffb4fed7997a7df2faa65e396fe7ecacd6fb1fb60"

RPROVIDES:${PN} += "acpica \
iasl"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
