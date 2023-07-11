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

PV = "20230331"

RPM_NAME = "acpica-20230331-1.1.aarch64.rpm"
RPM_HASH = "872e22c06caa3ca3cd6cd91410490e0c207080b2f8eaefa5b9f273d6cd6c058ea8216e099349bc879f7cb2f73bd039ec819881ec2f3aa4c7760722d10dc448e7"

RPROVIDES:${PN} += "acpica \
iasl"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
