SUMMARY = "Firmware Test Suite"
DESCRIPTION = "The FirmWare Test Suite (fwts) is a tool to do automatic testing of a PC's \
firmware. There can be a lot of subtle or vexing Linux Kernel/firmware issues \
caused when firmware is buggy, so it's useful to have a tool that can \
automatically check for common BIOS and ACPI errors. Where possible the tool \
will give some form of advice on how to fix issues or workaround firmware \
issues."
LICENSE = "GPL-2.0-or-later"

PV = "23.05.00"

RPM_NAME = "fwts-23.05.00-1.2.aarch64.rpm"
RPM_HASH = "82b2db8d07b09e1b662e25eae8ff94c238b6e0554e2a1b4c32bb7700caebaee4d2c852d3f7f505469f250235423cedb13cc4408ae9475feb90e8f6a116de77d4"

RPROVIDES:${PN} += "fwts \
libfwts.so.1 \
libfwtsacpica.so.1 \
libfwtsiasl.so.1"

RDEPENDS:${PN} += "bash-completion \
ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6 \
libfdt.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpci.so.3"

inherit rpm
