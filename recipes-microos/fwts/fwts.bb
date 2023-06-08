SUMMARY = "Firmware Test Suite"
DESCRIPTION = "The FirmWare Test Suite (fwts) is a tool to do automatic testing of a PC's \
firmware. There can be a lot of subtle or vexing Linux Kernel/firmware issues \
caused when firmware is buggy, so it's useful to have a tool that can \
automatically check for common BIOS and ACPI errors. Where possible the tool \
will give some form of advice on how to fix issues or workaround firmware \
issues."
LICENSE = "GPL-2.0-or-later"

PV = "23.03.00"

RPM_NAME = "fwts-23.03.00-1.1.aarch64.rpm"
RPM_HASH = "2cc6e91586996863ab93002cb3911770e5f732c6e2474590183260b9756bfd095625d84c5342d10ffe4fe78bfa2a487adc9d7cd7a0a1ec3a8763e3ef0572b8ee"

RPROVIDES:${PN} += "fwts fwts(aarch-64) libfwts.so.1()(64bit) libfwtsacpica.so.1()(64bit) libfwtsiasl.so.1()(64bit)"
RDEPENDS:${PN} += "bash-completion ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbsd.so.0()(64bit) libbsd.so.0(LIBBSD_0.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfdt.so.1()(64bit) libfdt.so.1(LIBFDT_1.2)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpci.so.3()(64bit) libpci.so.3(LIBPCI_3.0)(64bit) libpci.so.3(LIBPCI_3.5)(64bit) libpci.so.3(LIBPCI_3.8)(64bit)"

inherit rpm
