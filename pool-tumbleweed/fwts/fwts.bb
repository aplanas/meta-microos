SUMMARY = "Firmware Test Suite"
DESCRIPTION = "The FirmWare Test Suite (fwts) is a tool to do automatic testing of a PC's \
firmware. There can be a lot of subtle or vexing Linux Kernel/firmware issues \
caused when firmware is buggy, so it's useful to have a tool that can \
automatically check for common BIOS and ACPI errors. Where possible the tool \
will give some form of advice on how to fix issues or workaround firmware \
issues."
LICENSE = "GPL-2.0-or-later"

PV = "23.07.00"

RPM_NAME = "fwts-23.07.00-1.1.aarch64.rpm"
RPM_HASH = "7a54712cbf449aea424018211639bbbeb056d79e8531ba54357538f122d9ce9bba21fc3dedb9712c084ad8dc1a0d5ace6b1bad90ad800ab3b99639250bd6bc51"

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
